package com.ctu.doc.sys.login;

import java.security.KeyPair;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctu.doc.common.enums.CodeEnum;
import com.ctu.doc.common.utils.RSAUtils;
import com.ctu.doc.common.vo.MsgJson;
import com.ctu.doc.common.vo.UserInfo;
import com.ctu.doc.sys.user.entity.SysUserEntity;
import com.ctu.doc.sys.user.service.SysUserService;

@Controller
@RequestMapping("/sys/login")
public class SysLoginController {
	
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 用户名-密码登录
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "userLogin")
	public MsgJson login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		MsgJson msg = new MsgJson();
		try {
			KeyPair keyPair = RSAUtils.getKeyPair();
			String userName = request.getParameter("userName");
			String password  = request.getParameter("password");
			if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
				msg.setCode(CodeEnum.NULL_USERNAME_OR_PWD.getCode());
				msg.setMessage(CodeEnum.NULL_USERNAME_OR_PWD.getDisplayName());
				return msg;
			}
			
			String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
            // RSA加密
            userName = RSAUtils.encrypt(userName, RSAUtils.getPublicKey(publicKey));
            password = RSAUtils.encrypt(password, RSAUtils.getPublicKey(publicKey));
            
            SysUserEntity userEntity = sysUserService.getSysUserByUserName(userName);
            if(userEntity == null) {
            	msg.setCode(CodeEnum.ERROR_USER_NOT.getCode());
				msg.setMessage(CodeEnum.ERROR_USER_NOT.getDisplayName());
				return msg;
            }
            userEntity = sysUserService.login(userName, password);
            if(userEntity == null) {
            	msg.setCode(CodeEnum.ERROR_PASSWORD.getCode());
				msg.setMessage(CodeEnum.ERROR_PASSWORD.getDisplayName());
				return msg;
            }
            
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName(userEntity.getUserName());
            userInfo.setNick(userEntity.getNick());
            session.setAttribute("SYS_USER_INFO", userInfo);
            session.setAttribute("userName", userEntity.getUserName());
            msg.setObj("/main");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
}
