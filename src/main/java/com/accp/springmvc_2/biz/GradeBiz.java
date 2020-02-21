package com.accp.springmvc_2.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springmvc_2.dao.GradeMapper;
import com.accp.springmvc_2.pojo.Grade;

@Service("GradeBiz")
public class GradeBiz {
	@Resource 
	private GradeMapper dao;
	
	public int add(List<Grade> scores) {
		return dao.add(scores);
	}
}
