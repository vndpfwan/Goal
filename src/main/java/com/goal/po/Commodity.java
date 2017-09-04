package com.goal.po;

import java.sql.Timestamp;

public class Commodity {
    private String id;

    private String cmdName;

    private String cmdDesc;

    private String cmdPrice;

    private Timestamp createTsp;

    private Timestamp changeTsp;

    private String tCmdTypeId1;

    private String tBrandId1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String gettCmdTypeId1() {
        return tCmdTypeId1;
    }

    public void settCmdTypeId1(String tCmdTypeId1) {
        this.tCmdTypeId1 = tCmdTypeId1;
    }

    public String gettBrandId1() {
        return tBrandId1;
    }

    public void settBrandId1(String tBrandId1) {
        this.tBrandId1 = tBrandId1;
    }
}