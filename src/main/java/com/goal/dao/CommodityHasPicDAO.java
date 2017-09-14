package com.goal.dao;

import com.goal.po.CommodityHasPic;

public interface CommodityHasPicDAO {
    int insert(CommodityHasPic record);

    int insertSelective(CommodityHasPic record);
}