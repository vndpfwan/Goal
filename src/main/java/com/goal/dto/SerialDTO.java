package com.goal.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * serials DTO
 * @author lee
 *
 */
public class SerialDTO {
	/**
	 * serial id
	 */
	private String serialsId;
	
	/**
	 * serials类型
	 */
	private String serialType;
	
	/**
	 * 父serials ID
	 */
	private String pSerialsId;

	public String getSerialsId() {
		return serialsId;
	}

	public void setSerialsId(String serialsId) {
		this.serialsId = serialsId;
	}

	public String getpSerialsId() {
		return pSerialsId;
	}

	public void setpSerialsId(String pSerialsId) {
		this.pSerialsId = pSerialsId;
	}
	
	
	public String getSerialType() {
		return serialType;
	}

	public void setSerialType(String serialType) {
		this.serialType = serialType;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
