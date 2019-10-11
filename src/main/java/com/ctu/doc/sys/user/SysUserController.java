package com.ctu.doc.sys.user;

import java.security.KeyPair;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctu.doc.common.controller.BaseController;
import com.ctu.doc.common.utils.RSAUtils;
import com.ctu.doc.common.vo.MsgJson;
import com.ctu.doc.sys.user.entity.SysUserEntity;
import com.ctu.doc.sys.user.service.SysUserService;

/**
 * 
 * User: lufangbu
 * Date: 2019/8/23
 * Time: 16:49
 * version: 1.0.0
 */
@Controller
@RequestMapping("/sys/user")
public class SysUserController extends BaseController{
	
	private SysUserService sysUserService;
	
	@GetMapping(value = "getUserList")
	@ResponseBody
	public Object getUserList() {
		return "你好！";
	}
	
	/**
	 * 用户注册
	 * @param userEntity
	 * @return
	 */
	@PostMapping(value = "userRegister")
	@ResponseBody
	public MsgJson userRegister(SysUserEntity userEntity) {
		MsgJson msg = new MsgJson();
		KeyPair keyPair;
		try {
			if(userEntity == null) {
				msg.error();
			}
			// RSA加密
			keyPair = RSAUtils.getKeyPair();
			String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
	        String userName = RSAUtils.encrypt(userEntity.getUserName(), RSAUtils.getPublicKey(publicKey));
	        String password = RSAUtils.encrypt(userEntity.getPassword(), RSAUtils.getPublicKey(publicKey));
	        userEntity.setUserName(userName);
	        userEntity.setPassword(password);
	        if(sysUserService.saveOrUpdate(userEntity) <= 0) {
	        	msg.setSuccess(false);
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	
}
