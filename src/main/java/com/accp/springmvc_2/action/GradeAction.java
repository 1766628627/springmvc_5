package com.accp.springmvc_2.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springmvc_2.biz.GradeBiz;
import com.accp.springmvc_2.pojo.Domen;
import com.accp.springmvc_2.pojo.Grade;

@RestController
@RequestMapping("/api/grades")
public class GradeAction {
	@Resource
	private GradeBiz biz;
	
	@PostMapping("grade")
	public Map<String, Object>add(@RequestBody List<Grade> scores){
		Map<String, Object> message=new HashMap<String, Object>();
		int count=biz.add(scores);
		if(count>0) {
			message.put("code", "200");
			
		}else {
			message.put("code", "300");
		} 
		return message;
	}
	
}
