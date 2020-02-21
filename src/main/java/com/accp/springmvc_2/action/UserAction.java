package com.accp.springmvc_2.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc_2.biz.PaperBiz;
import com.accp.springmvc_2.biz.UserBiz;


@Controller
@RequestMapping("/x") // 命名空间
public class UserAction {
	@Resource
	private UserBiz biz;
	
	@Resource
	private PaperBiz biz1;
	
	@PostMapping("/login")
	public String login(Model model,HttpSession session,String name,String pwd) {
		if(biz.querylogin(name, pwd)!=null) {
			session.setAttribute("user", biz.querylogin(name, pwd));
			model.addAttribute("paper", biz1.queryAll());
			return "shouye";
			
		}
		return null;
		
		
		
	}
}
