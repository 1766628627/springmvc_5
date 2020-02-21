package com.accp.springmvc_2.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springmvc_2.dao.StudentMapper;
import com.accp.springmvc_2.pojo.Student;

@Service("StudentBiz")
public class StudentBiz {
	@Resource
	private StudentMapper dao;
	
	public List<Student> query() {
		return dao.query();
	}
	public Student querybyname(String name) {
		return dao.querybyname(name);
	}
}
