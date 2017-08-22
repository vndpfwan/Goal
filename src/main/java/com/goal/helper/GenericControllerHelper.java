package com.goal.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.goal.po.ErrorInfo;
import com.goal.util.JsonUtil;
import com.goal.util.StringUtil;

/**
 * this class is a helper class used by Controller and handle some generic helper method
 * @author lizhiwei
 *
 */
@Component
public class GenericControllerHelper {
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
}
