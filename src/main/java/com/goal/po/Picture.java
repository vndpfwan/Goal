package com.goal.po;

import java.sql.Timestamp;

public class Picture {
    private String id;

    private String picType;

    private String picUrl;

    private String showAs;

    private String picIndex;

    private Timestamp changeTsp;

    private Timestamp createTsp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getShowAs() {
        return showAs;
    }

    public void setShowAs(String showAs) {
        this.showAs = showAs;
    }

    public String getPicIndex() {
        return picIndex;
    }

    public void setPicIndex(String picIndex) {
        this.picIndex = picIndex;
    }

    public Timestamp getChangeTsp() {
        return changeTsp;
    }

    public void setChangeTsp(Timestamp changeTsp) {
        this.changeTsp = changeTsp;
    }

    public Timestamp getCreateTsp() {
        return createTsp;
    }

    public void setCreateTsp(Timestamp createTsp) {
        this.createTsp = createTsp;
    }
}