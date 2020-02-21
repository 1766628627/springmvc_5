package com.accp.springmvc_2.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.springmvc_2.biz.StudentBiz;
import com.accp.springmvc_2.pojo.Student;

@RestController
@RequestMapping("/api/students")
public class StudentAction {
	@Resource 
	private StudentBiz biz;
	
	@GetMapping
	public List<Student> query() {
		return biz.query();
	}
	@GetMapping("student/{name}")
	public Student querybyname(@PathVariable String name) {
		return biz.querybyname(name);
	}
}
