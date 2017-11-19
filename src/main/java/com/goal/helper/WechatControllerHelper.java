package com.goal.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.goal.util.RequestUtil;

@Component("wechatControllerHelper")
public class WechatControllerHelper {

	public static Logger logger = LoggerFactory.getLogger(WechatControllerHelper.class);
	
	public String getOpenIdBySlientAuthy(String code){
		
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxa1378048216955b0&secret=6ac0b7bfb762290e38034fd159d8d4a6&code=" + code + "&grant_type=authorization_code";
		
		RequestUtil requestUtil = new RequestUtil();
		JSONObject jsonObject = null;
		try {
			jsonObject = requestUtil.doGetUrl(url);
		} catch (Exception e) {
			logger.error("request openid errer");
		}
		
		return jsonObject.getString("openid");
	}
}
