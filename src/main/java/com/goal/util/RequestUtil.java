package com.goal.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.goal.controller.AbstractController;

public class RequestUtil {

	public static Logger logger = LoggerFactory.getLogger(RequestUtil.class);
	
	public JSONObject doGetUrl(String url) throws Exception{
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response;
		String result;
		
		try {
			response = client.execute(httpGet);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);
		} catch (IOException e) {
			logger.error("get request error");
			throw new Exception("execute GET request error！{}", e);
		}
				
		return JSONObject.parseObject(result);
		
	}
	
	public JSONObject doPostUrl(String url, String param) throws ClientProtocolException, IOException{
		
		final String CONTENT_TYPE_TEXT_JSON = "application/json";
		DefaultHttpClient httpClient = new DefaultHttpClient(new PoolingClientConnectionManager());
		HttpPost post = new HttpPost(url);
		HttpResponse response;
		String result = null;
		
		try {
			StringEntity stringEntity = new StringEntity(param);
			stringEntity.setContentType(CONTENT_TYPE_TEXT_JSON);
			stringEntity.setContentEncoding("UTF-8");
			post.setEntity(stringEntity);
			response = httpClient.execute(post);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			logger.error("post request error");
			//throw new Exception("execute POST request error！{}", e);
		}
		return JSONObject.parseObject(result);
		
	}
}
