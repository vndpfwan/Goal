package com.goal.po;

import java.sql.Timestamp;

public class CmdParam {
    private String id;

    private String cmdKey;

    private String cmdValue;

    private Timestamp createTsp;

    private Timestamp changeTsp;

    private String tCommodityId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCmdKey() {
        return cmdKey;
    }

    public void setCmdKey(String cmdKey) {
        this.cmdKey = cmdKey;
    }

    public String getCmdValue() {
        return cmdValue;
    }

    public void setCmdValue(String cmdValue) {
        this.cmdValue = cmdValue;
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

    public String gettCommodityId() {
        return tCommodityId;
    }

    public void settCommodityId(String tCommodityId) {
        this.tCommodityId = tCommodityId;
    }
}