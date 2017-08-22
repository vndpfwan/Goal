package com.goal.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.goal.form.UserForm;
import com.goal.po.User;
import com.goal.service.UserService;
import com.goal.validator.UserValidator;

@Controller
@RequestMapping("/hello")
public class UserController extends AbstractController{
	
//	@Resource  
//    private UserService userService;  
	@InitBinder
    public void initBinder(DataBinder binder) {
    	binder.replaceValidators(new UserValidator());
    }
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@Validated UserForm uf,BindingResult br) {
		if(br.hasErrors()) {
			return "reg_form";
		}
		return "sucess";
	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
    public String getIndex(UserForm uf){      
    	logger.info("show me the money!");
        return "reg_form";
    }
    
	@RequestMapping(value="/hi",method=RequestMethod.GET)
    public String hello() {
    	logger.info("hello money!");
    	return "index";
    }
	
	/**
	 * use @ResponseBody to tell Spring MVC not to render a model into a view, but to write the returned object into response body
	 * @return
	 */
	@RequestMapping(value="/givemeJson",method=RequestMethod.GET)
	public @ResponseBody User returnJson() {
		return new User(1,"lee","123");
	}
}
