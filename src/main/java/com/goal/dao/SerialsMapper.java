package com.goal.dao;

import com.goal.po.Serials;

public interface SerialsMapper {
    int insert(Serials record);

    int insertSelective(Serials record);
}