package com.goal.form;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 推荐商品form
 * @author lizhiwei
 *
 */
public class RecommendCmdForm {
	/**
	 * 商品id
	 */
	private String cmdId;
	/**
	 * 商品名称(2017-10-13根据前台需求更新)
	 */
//	private String cmdName;
	private String name;
	
	/**
	 * 商品描述(2017-10-13根据前台需求更新)
	 */
//	private String cmdDesc;
	private String desc;
	/**
	 * 商品价格(2017-10-13根据前台需求更新)
	 */
//	private String cmdPrice;
	private String price;
	
	/**
	 * 商品图片(2017-10-13根据前台需求更新)
	 */
	private String picURL;
	
	public String getCmdId() {
		return cmdId;
	}
	public void setCmdId(String cmdId) {
		this.cmdId = cmdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getPicURL() {
		return picURL;
	}
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	@Override
	public String toString() {
		//通过apache commons的反射方法生成toString方法
		return ReflectionToStringBuilder.toString(this);
	}
}
