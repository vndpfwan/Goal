package com.goal.dao;

import com.goal.po.Picture;

public interface PictureMapper {
    int insert(Picture record);

    int insertSelective(Picture record);
}