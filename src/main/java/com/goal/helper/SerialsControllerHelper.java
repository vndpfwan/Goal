package com.goal.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.goal.dto.SerialSliderDTO;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;
import com.goal.service.SerialsService;

/**
 * 系列控制器帮助类
 * @author lizhiwei
 *
 */
public class SerialsControllerHelper extends GenericControllerHelper {
	@Autowired
	SerialsService sService;
	
	
	/**
	 * 从配置文件中取得父系列的id并包装成form
	 * @return
	 */
	public List<SerialsForm> getSliderListByParentId() {
		//to_do 从配置文件中取得父系列的id
		SerialSliderDTO dto = new SerialSliderDTO();
		dto.setpSerialsId("");//read slider parent id from config file,to be implemented
		return sService.getSerialsListByParentId(dto);
	}
}
