package com.ctu.doc.sys.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctu.doc.common.vo.MsgJson;

@Controller
@RequestMapping("/sys/login")
public class SysLoginController {
	
	@ResponseBody
	@PostMapping(value = "userLogin")
	public MsgJson login(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		MsgJson msg = new MsgJson();
		return msg;
	}

}
