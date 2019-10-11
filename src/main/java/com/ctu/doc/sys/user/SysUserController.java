package com.ctu.doc.sys.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctu.doc.common.controller.BaseController;

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
	
	
	@GetMapping(value ="getUserList")
	@ResponseBody
	public Object getUserList() {
		return "你好！";
	}
	
	
}
