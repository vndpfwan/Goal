package com.goal.wxpay;

import java.util.HashMap;
import java.util.Map;

import com.goal.po.OAuth;
import com.goal.wxpay.WXPay;
import com.goal.wxpay.WXPayConfigImpl;

public class WXPayPerformance {

    private WXPay wxpay;
    private WXPayConfigImpl config;
    private String out_trade_no;
    private String total_fee;
    
    
	public WXPayPerformance() throws Exception {
		config = WXPayConfigImpl.getInstance();
        wxpay = new WXPay(config);
        total_fee = "1";
        out_trade_no = "201711127496748980290321";
	}
    
	public Map<String, String> doUnifiedOrder(OAuth oAuth){
		
		Map<String, String> result = null;
		
		HashMap<String, String> data = new HashMap<String, String>();		
		data.put("body", "冲个玩玩");
		data.put("out_trade_no", out_trade_no);
        data.put("device_info", "WEB");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://www.makeiteasy.xin/wxpay/notify");
        data.put("trade_type", "JSAPI");
        data.put("product_id", "12");
        data.put("openid", oAuth.getOpenid());
        
        try {
            result = wxpay.unifiedOrder(data);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
		return result;
	}
    
}
