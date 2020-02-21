package com.accp.springmvc_2.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springmvc_2.dao.PaperMapper;
import com.accp.springmvc_2.pojo.Paper;


@Service("PaperBiz")
public class PaperBiz {
	@Resource
	private PaperMapper dao;
	
	public List<Paper> queryAll() {
		return dao.queryAll();
	}
	public int add(Paper paper) {
		return dao.add(paper);
	}
	public int remove(int id) {
		return dao.remove(id);
	}
	public List<Paper> queryby(String name,String type) {
		return dao.queryby(name, type);
	}
	public Paper querybyid(int id) {
		return dao.querybyid(id);
	}
	public int modify(Paper paper) {
		return dao.modify(paper);
	}
	
	
}
