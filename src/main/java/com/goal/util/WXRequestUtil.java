package com.goal.util;

public class WXRequestUtil {

	public static String getSilentUrl(){
		
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?"
				+ "appid=wxa1378048216955b0"
				+ "&redirect_uri=http://www.makeiteasy.xin/trade/check"
				+ "&response_type=code"
				+ "&scope=snsapi_base#wechat_redirect";
		
		return url;
	}
}
