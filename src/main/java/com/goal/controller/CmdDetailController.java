package com.goal.controller;

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
import com.goal.po.Commodity;

@Controller
@RequestMapping(value="/detail")
public class CmdDetailController extends AbstractController {

	private static final Log logger = LogFactory.getLog(CmdDetailController.class);
	
	@ResponseBody
	@RequestMapping(value="/{cmdId}",method=RequestMethod.GET)
	public Object cmdDetail(@PathVariable String cmdId) throws JsonProcessingException{
		ObjectMapper mapper= new ObjectMapper();
		CmdDetailForm cmdDetailForm = new CmdDetailForm();
		logger.info(mapper.writeValueAsString(cmdDetailForm));
		return new CmdDetailForm();
	}
	
	@ResponseBody
	@RequestMapping(value="/Detail",method=RequestMethod.GET)
	public Object cmdDetailJason(@RequestBody CmdDetailForm cmdDetailForm) throws JsonProcessingException{
		ObjectMapper mapper= new ObjectMapper();
		logger.info(mapper.writeValueAsString(cmdDetailForm));
		//cmdDetailForm
		return cmdDetailForm;
	}
}
