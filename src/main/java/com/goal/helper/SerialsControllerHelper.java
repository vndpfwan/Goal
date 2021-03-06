package com.goal.helper;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.goal.dto.SerialDTO;
import com.goal.form.RecommendCmdForm;
import com.goal.form.SerialsForm;
import com.goal.po.Serials;
import com.goal.service.SerialsService;
import com.goal.util.StringUtil;
import com.goal.util.properties.CommonConfigProperties;

/**
 * 系列控制器帮助类
 * @author lizhiwei
 *
 */
@Component("serialsHelper")
public class SerialsControllerHelper extends GenericControllerHelper{
	private Logger LOG = LoggerFactory.getLogger(SerialsControllerHelper.class);
	@Resource
	SerialsService sService;
	
	
	/**
	 * 从配置文件中取得父系列的id并包装成form
	 * @return
	 */
	public List<SerialsForm> getSliderListByParentId() {
		//to_do 从配置文件中取得父系列的id
		SerialDTO dto = new SerialDTO();
		dto.setpSerialsId(CommonConfigProperties.getHomepageSliderSerialId());//read slider parent id from config file
		dto.setShowAs(PICTURE_SHOW_AS_HOMEPAGE_SLIDER);//获得系列首页图片
		LOG.info("sService:"+sService);
		List<SerialsForm> list = sService.getSerialsListByParentId(dto);
		list.parallelStream().forEach(sForm->sForm.setPicURL(combinePictureUrl(sForm.getPicURL())));
		return list;
	}
	
	/**
	 * 通过系列取得推荐商品集合
	 * @return
	 */
	public List<RecommendCmdForm> getRecommendCmdBySerialId(){
		//to_do 从配置文件中取得推荐系列的id
		SerialDTO dto = new SerialDTO();
		dto.setSerialsId(CommonConfigProperties.getHomepageRecommendSerialId());
		dto.setShowAs(PICTURE_SHOW_AS_FIRST_CHOICE);//从图片表中取得show_as为3的图片
		List<RecommendCmdForm> list = sService.getRecommendCmdBySerialsId(dto);
		list.parallelStream().forEach(rForm->rForm.setPicURL(combinePictureUrl(rForm.getPicURL())));
		return list;
	}

}
