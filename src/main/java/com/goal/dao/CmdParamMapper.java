package com.goal.dao;

import com.goal.po.CmdParam;

public interface CmdParamMapper {
    int insert(CmdParam record);

    int insertSelective(CmdParam record);
}