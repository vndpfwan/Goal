package com.goal.dao;

import com.goal.po.Commodity;

public interface CommodityMapper {
    int insert(Commodity record);

    int insertSelective(Commodity record);
}