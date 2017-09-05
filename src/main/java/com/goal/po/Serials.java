package com.goal.po;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import java.sql.Timestamp;

public class Serials {
    private String id;

    private String serialType;

    private String serialName;

    private String serialUrl;

    private String serialLevel;

    private String pSerialId;

    private Timestamp createTsp;

    private Timestamp changeTsp;

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

    public String getpSerialId() {
        return pSerialId;
    }

    public void setpSerialId(String pSerialId) {
        this.pSerialId = pSerialId;
    }

    public Timestamp getCreateTsp() {
        return createTsp;
    }

    public void setCreateTsp(Timestamp createTsp) {
        this.createTsp = createTsp;
    }

    public Timestamp getChangeTsp() {
        return changeTsp;
    }

    public void setChangeTsp(Timestamp changeTsp) {
        this.changeTsp = changeTsp;
    }
    
    @Override
	public String toString() {
		//通过apache commons的反射方法生成toString方法
		return ReflectionToStringBuilder.toString(this);
	}
}
