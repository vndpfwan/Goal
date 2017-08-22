package com.goal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.goal.helper.GenericControllerHelper;
import com.goal.po.ErrorInfo;
import com.goal.util.JsonUtil;
import com.goal.util.StringUtil;

/**
 * this class is the super class of all controller, used to do the generic resource handle.
 * @author lizhiwei
 *
 */
public abstract class AbstractController {
	public static Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	@Resource
	private GenericControllerHelper genericHelper;
	
	/**
	 * get error json String
	 * @param br
	 * @return
	 * @throws JsonProcessingException 
	 */
	public String getErrorJson(BindingResult br) throws JsonProcessingException {
		return genericHelper.getErrorJSON(br);
	}
}
