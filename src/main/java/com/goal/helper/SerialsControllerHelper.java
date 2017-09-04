package com.goal.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	 * 通过系列取得子系列集合
	 * @param sForm
	 * @return
	 */
	public List<SerialsForm> getSliderListByParentId(SerialsForm sForm){
		Serials s = new Serials();
		s.setId(sForm.getSerialsId());
		List<Serials> sList = sService.getSerialsListByParentId(s);
		List<SerialsForm> sFormList = new ArrayList<>();
		for (Serials serial : sList) {
			SerialsForm sf = new SerialsForm();
			sf.setSerialsId(serial.getId());
			sf.setSerialsName(serial.getSerialName());
			sf.setUrl(serial.getSerialUrl());
			sf.setPicURL(serial.getSerialUrl());
			sFormList.add(sf);
		}
		return sFormList;
	}
	
	/**
	 * 从配置文件中取得父系列的id并包装成form
	 * @return
	 */
	public SerialsForm getSerialForm() {
		//to_do 从配置文件中取得父系列的id
		
		return null;
	}
}
