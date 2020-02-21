package com.accp.springmvc_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.Student;

public interface StudentMapper {
   List<Student> query();
   Student querybyname(@Param("name")String name);
}