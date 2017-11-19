package com.goal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goal.helper.WechatControllerHelper;
import com.goal.util.RequestUtil;
import com.goal.util.WXRequestUtil;

@Controller
@RequestMapping("/trade")
public class WechatController extends AbstractController{

	public static Logger logger = LoggerFactory.getLogger(WechatController.class);
	
	@Resource
	WechatControllerHelper wechatControllerHelper;
	
	@RequestMapping("/code")
	public void getCode(){
		RequestUtil requestUtil = new RequestUtil();
		String url = WXRequestUtil.getSilentUrl();
		if(url != null){
			try {
				requestUtil.doGetUrl(url);
			} catch (Exception e) {
				logger.error("do get request code error");
			}
		}else{
			logger.debug("url is null !");;
		}
		
		
	}
	
	@RequestMapping("/check")
	public @ResponseBody Object callbackBase(@RequestParam(value = "code", required = false) String code, HttpServletResponse response){
		String openid = wechatControllerHelper.getOpenIdBySlientAuthy(code);
		logger.debug("openid = {}",openid);
		return null;
	}
	
}
