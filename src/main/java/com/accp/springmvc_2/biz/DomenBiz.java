package com.accp.springmvc_2.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.accp.springmvc_2.dao.DomenMapper;
import com.accp.springmvc_2.pojo.Domen;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("DomenBiz")
public class DomenBiz {
	@Autowired
	private DomenMapper dao;
	
	public  PageInfo<Domen> pageInfo(int pageNum,int pageSize) {
		PageHelper .startPage(pageNum, pageSize);
		PageInfo<Domen> page= new PageInfo<>(dao.query());
		return page;
	}
	
	public int add(Domen domen) {
		return dao.add(domen);
	}
	public Domen querybyid(Integer id) {
		return dao.querybyid(id);
	}
	public int modify(Domen domen) {
		return dao.modify(domen);
	}
	public int remove(Integer id) {
		return dao.remove(id);
	}
}
