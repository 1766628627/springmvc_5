package com.accp.springmvc_2.biz;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc_2.dao.UserMapper;
import com.accp.springmvc_2.pojo.User;

@Service("UserBiz")
public class UserBiz {
	@Resource
	private UserMapper dao;
	
	public User querylogin(String name,String pwd) {
		return dao.querylogin(name, pwd);
	}
}
