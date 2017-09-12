package com.goal.form;

public class RecommendForm {
	/**
	 * 系列id
	 */
	private String serialsId;
	
	/**
	 * 系列名
	 */
	private String serialsName;
	
	/**
	 * 系列URL
	 */
	private String url;
	
	
	/**
	 * 系列图片URL
	 */
	private String picURL;
	
	/**
	 * 商品名称
	 */
	private String cmdName;
	
	/**
	 * 商品价格
	 */
	private String price;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPicURL() {
		return picURL;
	}

	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}

	public String getCmdName() {
		return cmdName;
	}

	public void setCmdName(String cmdName) {
		this.cmdName = cmdName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
