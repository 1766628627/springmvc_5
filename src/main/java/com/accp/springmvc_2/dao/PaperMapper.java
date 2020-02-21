package com.accp.springmvc_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.Paper;

public interface PaperMapper {
	List<Paper> queryAll();
	
	int add(Paper paper);
	
	int remove(@Param("id") int id);
	List<Paper> queryby(@Param("name") String name,@Param("type") String type);
	Paper querybyid(@Param("id") int id);
	int modify(Paper paper);
}