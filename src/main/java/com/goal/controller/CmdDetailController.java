package com.goal.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goal.form.CmdDetailForm;
import com.goal.helper.CmdDetailControllerHelper;

@Controller
@RequestMapping(value="/detail")
public class CmdDetailController extends AbstractController {

	private static final Log logger = LogFactory.getLog(CmdDetailController.class);
	
	@Resource 
	CmdDetailControllerHelper helper;
	
	@ResponseBody
	@RequestMapping(value="/display/{cmdId}",method=RequestMethod.GET)
	public Object getDetailPictures(@PathVariable String cmdId){
		logger.info("request to get detail pics");
		String showAs = "4";
		return helper.getDisplayPicturesByCmdId(cmdId, showAs);
	}
	
	@ResponseBody
	@RequestMapping(value="/description/{cmdId}",method=RequestMethod.GET)
	public Object getDetailDescriprions(@PathVariable String cmdId){
		logger.info("request to get desc pics");
		String showAs="5";
		return helper.getDescriptonPicturesByCmdId(cmdId, showAs);
	}
	
	@ResponseBody
	@RequestMapping(value="/commodity/{cmdId}",method=RequestMethod.GET)
	public Object getCommodity(@PathVariable String cmdId){
		logger.info("request to get cmd");
		return helper.getCommodityByCmdId(cmdId);
	}
	
	@ResponseBody
	@RequestMapping(value="/param/{cmdId}",method=RequestMethod.GET)
	public Object getCmdParam(@PathVariable String cmdId){
		logger.info("request to get params");
		return helper.getCmdParamsByCmdId(cmdId);
		
	}
}
