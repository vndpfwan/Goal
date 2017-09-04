package com.goal.dao;

import com.goal.po.Brand;

public interface BrandMapper {
    int insert(Brand record);

    int insertSelective(Brand record);
}