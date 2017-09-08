package com.goal.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SerialSliderDTO {
	private String serialsId;
	
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
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
