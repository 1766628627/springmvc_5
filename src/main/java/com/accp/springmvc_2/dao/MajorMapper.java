package com.accp.springmvc_2.dao;

import com.accp.springmvc_2.pojo.Major;

public interface MajorMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}