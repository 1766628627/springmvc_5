package com.accp.springmvc_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.Curriculum;

public interface CurriculumMapper {
    List<Curriculum> querybymid(@Param("id") Integer id);
}