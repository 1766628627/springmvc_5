package com.accp.springmvc_2.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.FlightInfo;

public interface FlightInfoMapper {
   FlightInfo queryNo(@Param("no") String no);
}