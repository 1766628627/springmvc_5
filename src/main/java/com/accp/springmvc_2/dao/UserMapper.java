package com.accp.springmvc_2.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.User;

public interface UserMapper {
   User querylogin(@Param("name") String name,@Param("pwd")String pwd);
   
}