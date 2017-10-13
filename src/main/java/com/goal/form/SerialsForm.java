package com.goal.form;

/**
 * 用于系列表单对象的包装
 * @author lizhiwei
 *
 */
public class SerialsForm {

	/**
	 * 系列id
	 */
	private String serialsId;
	
	/**
	 * 系列名
	 */
	private String serialsName;
	
	/**
	 * 系列URL(2017-10-13根据前台需求更新)
	 */
//	private String url;
	private String clickURL;
	
	
	/**
	 * 系列图片URL
	 */
	private String picURL;


	public String getSerialsId() {
		return serialsId;
	}


	public void setSerialsId(String serialsId) {
		this.serialsId = serialsId;
	}


	public String getSerialsName() {
		return serialsName;
	}


	public void setSerialsName(String serialsName) {
		this.serialsName = serialsName;
	}


	public String getClickURL() {
		return clickURL;
	}


	public void setClickURL(String clickURL) {
		this.clickURL = clickURL;
	}


	public String getPicURL() {
		return picURL;
	}


	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	
	@Override
	public String toString() {
		return "SerialSliderDTO [serialsId="+serialsId+",serialsName="+serialsName+",url="+clickURL+"+\",picURL=\"+picURL+\"]";
	}
}
