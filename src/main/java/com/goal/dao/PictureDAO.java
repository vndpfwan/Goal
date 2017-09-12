package com.goal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goal.dto.CmdPicDTO;
import com.goal.form.CmdPicForm;
import com.goal.po.Picture;

public interface PictureDAO {
    int insert(Picture record);

    int insertSelective(Picture record);
    
    List<CmdPicForm> getPicturesByCmdId(@Param("record") CmdPicDTO record);
    
}