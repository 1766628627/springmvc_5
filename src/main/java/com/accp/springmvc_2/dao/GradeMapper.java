package com.accp.springmvc_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.Grade;

public interface GradeMapper {
   
    int add(@Param("scores")List<Grade> scores);

    
}