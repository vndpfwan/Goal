package com.goal.dao;

import com.goal.po.SerialsHasCommodity;

public interface SerialsHasCommodityDAO {
    int insert(SerialsHasCommodity record);

    int insertSelective(SerialsHasCommodity record);
}