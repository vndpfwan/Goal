package com.goal.dao;

import com.goal.po.CmdType;

public interface CmdTypeMapper {
    int insert(CmdType record);

    int insertSelective(CmdType record);
}