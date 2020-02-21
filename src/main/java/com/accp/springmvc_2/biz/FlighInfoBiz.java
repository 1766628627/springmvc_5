package com.accp.springmvc_2.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc_2.dao.FlightInfoMapper;
import com.accp.springmvc_2.pojo.FlightInfo;

@Service("FlighInfoBiz")
public class FlighInfoBiz {
	@Autowired
	private FlightInfoMapper dao;
	
	public FlightInfo queryno(String no) {
		return dao.queryNo(no);
	}
}
