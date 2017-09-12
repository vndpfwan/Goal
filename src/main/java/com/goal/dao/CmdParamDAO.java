package com.goal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.goal.po.CmdParam;

public interface CmdParamDAO {
    int insert(CmdParam record);

    int insertSelective(CmdParam record);
    
    List<CmdParam> getCmdParamsByCmdId(@Param("cmdID") String cmdId);
}