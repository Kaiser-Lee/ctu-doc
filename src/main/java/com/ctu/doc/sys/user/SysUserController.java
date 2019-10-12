package com.ctu.doc.sys.user;

import java.security.KeyPair;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ctu.doc.common.controller.BaseController;
import com.ctu.doc.common.utils.MD5Utils;
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
	
	@Autowired
	private SysUserService sysUserService;
	
	@GetMapping(value = "getUserList")
	@ResponseBody
	public Object getUserList() {
		return "你好！";
	}
	
	@RequestMapping(value = "toRegister")
	public String toRegister() {
		return "/admin/user/register/register";
	}
	
	@GetMapping(value = "validatorUserName")
	@ResponseBody
	public Object validatorUserName(SysUserEntity userEntity) {
		JSONObject json = new JSONObject();
		String userName = userEntity.getUserName();
		boolean bool = true;
		List<SysUserEntity> list = null;
		if(StringUtils.isEmpty(userEntity.getId())) { // 新增
			list = sysUserService.getSysUserByUserName(userName);
		}else {
			list = sysUserService.validatorUser(userName, userEntity.getId());
		}
		if(list.size() > 0 ) {
			bool = false;
		}
		json.put("valid", bool);
		return json;
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
			/*keyPair = RSAUtils.getKeyPair();
			String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
	        String password = RSAUtils.encrypt(userEntity.getPassword(), RSAUtils.getPublicKey(publicKey));*/
	        String password = MD5Utils.encrypt(userEntity.getUserName(), userEntity.getPassword());
	        userEntity.setPassword(password);
	        userEntity.setCreateTime(new Date());
	        int count = sysUserService.saveOrUpdate(userEntity);
	        if(count <= 0) {
	        	msg.setSuccess(false);
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
	
}
