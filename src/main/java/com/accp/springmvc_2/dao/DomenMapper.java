package com.accp.springmvc_2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.springmvc_2.pojo.Domen;

public interface DomenMapper {
   List<Domen> query();
   int add(@Param("domen") Domen domen);
   Domen querybyid(@Param("id") Integer id);
   int modify(@Param("domen") Domen domen);
   int remove (@Param("id") Integer id);
}