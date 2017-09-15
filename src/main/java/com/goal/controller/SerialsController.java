package com.goal.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goal.form.RecommendCmdForm;
import com.goal.form.SerialsForm;
import com.goal.helper.SerialsControllerHelper;
import com.goal.util.Constant;

/**
 * 系列控制器
 * @author lizhiwei
 *
 */
@RequestMapping("/homepage/serials")
@Controller
public class SerialsController extends AbstractController{
	
	@Resource
	SerialsControllerHelper serialsHelper;
	
	/**
	 * 取得滑动控件的集合
	 * @return
	 */
	@RequestMapping(value="/sliders",method=RequestMethod.GET)
	public @ResponseBody List<SerialsForm> getSliderList(){
		logger.info("request service: getSlider list");
		return serialsHelper.getSliderListByParentId();
	}
	
	/**
	 * 取得推荐商品的集合
	 * @return
	 */
	@RequestMapping(value="/recommend",method=RequestMethod.GET)
	public @ResponseBody List<RecommendCmdForm> getRecommendCmdList(){
		logger.info("request service: getSlider list");
		return serialsHelper.getRecommendCmdBySerialId();
	}
	
	
}
