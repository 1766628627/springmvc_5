package com.accp.springmvc_2.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.accp.springmvc_2.biz.FlighInfoBiz;
import com.accp.springmvc_2.pojo.FlightInfo;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/c") // 命名空间
public class FlighInfoAction {
	@Autowired
	private FlighInfoBiz biz;
	
	@GetMapping("/index")
	public String query() {
		return "index";
	}
	@GetMapping("/query")
	public String queryNo(Model model, String no) {
		FlightInfo flightInfo=biz.queryno(no);
		model.addAttribute("fl", flightInfo);
		return "query";
	}
}
