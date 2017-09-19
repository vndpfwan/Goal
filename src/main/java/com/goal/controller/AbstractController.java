package com.goal.controller;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.goal.helper.GenericControllerHelper;
import com.goal.util.Constant;

/**
 * this class is the super class of all controller, used to do the generic resource handle.
 * @author lizhiwei
 *
 */
public abstract class AbstractController implements Constant{
	public static Logger logger = LoggerFactory.getLogger(AbstractController.class);
	
	public Constant CONSTANT;
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
