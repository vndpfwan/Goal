package com.goal.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.goal.po.ErrorInfo;
import com.goal.util.Constant;
import com.goal.util.JsonUtil;
import com.goal.util.StringUtil;
import com.goal.util.properties.CommonConfigProperties;

/**
 * this class is a helper class used by Controller and handle some generic helper method
 * @author lizhiwei
 *
 */
public class GenericControllerHelper implements Constant{
	/**
	 * get error json String
	 * @param br
	 * @return
	 * @throws JsonProcessingException 
	 */
	public String getErrorJSON(BindingResult br) throws JsonProcessingException {
		if(br!=null && br.getAllErrors().size()==0) {
			return StringUtil.EMPTY;
		}
		
		List<ErrorInfo> list = new ArrayList<>();
		for (FieldError fe : br.getFieldErrors()) {
			ErrorInfo errInfo = new ErrorInfo();
			errInfo.setErrorCode(fe.getCode());
			errInfo.setErrorField(fe.getField());
			errInfo.setErrorMsg(fe.getDefaultMessage());
			list.add(errInfo);
		}
		return JsonUtil.generateJSONFromObj(list);
	}
	
	/**
	 * 从配置文件中取得图片url前缀与传入的相对路径合成
	 * @param origin
	 * @return
	 */
	protected String combinePictureUrl(String origin) {
		if(!StringUtil.isEmpty(origin)) {
			StringBuffer sb = new StringBuffer();
			sb.append(CommonConfigProperties.getPicturePreUrl());
			sb.append(origin);
			return sb.toString();
		}
		return null;
	}
}
