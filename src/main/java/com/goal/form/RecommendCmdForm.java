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
	private String CmdId;
	/**
	 * 商品名称
	 */
	private String cmdName;
	/**
	 * 商品描述
	 */
	private String cmdDesc;
	/**
	 * 商品价格
	 */
	private String cmdPrice;
	
	/**
	 * 商品图片
	 */
	private String picUrl;
	
	public String getCmdId() {
		return CmdId;
	}
	public void setCmdId(String cmdId) {
		CmdId = cmdId;
	}
	public String getCmdName() {
		return cmdName;
	}
	public void setCmdName(String cmdName) {
		this.cmdName = cmdName;
	}
	public String getCmdDesc() {
		return cmdDesc;
	}
	public void setCmdDesc(String cmdDesc) {
		this.cmdDesc = cmdDesc;
	}
	public String getCmdPrice() {
		return cmdPrice;
	}
	public void setCmdPrice(String cmdPrice) {
		this.cmdPrice = cmdPrice;
	}
	
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	@Override
	public String toString() {
		//通过apache commons的反射方法生成toString方法
		return ReflectionToStringBuilder.toString(this);
	}
}
