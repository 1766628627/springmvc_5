package com.accp.springmvc_2.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.springmvc_2.dao.CurriculumMapper;
import com.accp.springmvc_2.pojo.Curriculum;

@Service("CurriculumBiz")
public class CurriculumBiz {
	@Resource
	private CurriculumMapper dao;
	
	public List<Curriculum> querybymid(Integer id) {
		return dao.querybymid(id);
	}
}
