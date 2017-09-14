package com.goal.dao;

import org.apache.ibatis.annotations.Param;

import com.goal.form.CmdDetailForm;
import com.goal.po.Commodity;

public interface CommodityDAO {
    int insert(Commodity record);

    int insertSelective(Commodity record);
    
    CmdDetailForm getCommodityByCmdId(@Param("record") String record);
}