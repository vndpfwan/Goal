package com.goal.po;

import java.sql.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 系列ORM对象
 * table - t_serials
 * @author lizhiwei
 *
 */
public class Serials {
	private String id;
	
	private String serialType;
	
	private String serialName;
	
	private String serialUrl;
	
	private String serialLevel;
	
	private String parentSerialsId;
	
	private Date createTsp;
	
	private Date changeTsp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSerialType() {
		return serialType;
	}

	public void setSerialType(String serialType) {
		this.serialType = serialType;
	}

	public String getSerialName() {
		return serialName;
	}

	public void setSerialName(String serialName) {
		this.serialName = serialName;
	}

	public String getSerialUrl() {
		return serialUrl;
	}

	public void setSerialUrl(String serialUrl) {
		this.serialUrl = serialUrl;
	}

	public String getSerialLevel() {
		return serialLevel;
	}

	public void setSerialLevel(String serialLevel) {
		this.serialLevel = serialLevel;
	}

	public String getParentSerialsId() {
		return parentSerialsId;
	}

	public void setParentSerialsId(String parentSerialsId) {
		this.parentSerialsId = parentSerialsId;
	}

	public Date getCreateTsp() {
		return createTsp;
	}

	public void setCreateTsp(Date createTsp) {
		this.createTsp = createTsp;
	}

	public Date getChangeTsp() {
		return changeTsp;
	}

	public void setChangeTsp(Date changeTsp) {
		this.changeTsp = changeTsp;
	}
	
	@Override
	public String toString() {
		//通过apache commons的反射方法生成toString方法
		return ReflectionToStringBuilder.toString(this);
	}
}
