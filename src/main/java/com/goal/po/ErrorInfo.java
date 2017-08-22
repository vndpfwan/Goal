package com.goal.po;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * this class used to package the error information
 * @author lizhiwei
 *
 */
public class ErrorInfo {
	/**
	 * 错误代码
	 */
	private String errorCode;
	
	/**
	 * 错误消息
	 */
	private String errorMsg;
	
	/**
	 * 错误字段
	 */
	private String errorField;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorField() {
		return errorField;
	}

	public void setErrorField(String errorField) {
		this.errorField = errorField;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.DEFAULT_STYLE).append(errorCode).append(errorField).append(errorMsg).build();
	}
	
}
