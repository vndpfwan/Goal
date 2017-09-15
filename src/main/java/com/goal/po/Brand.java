package com.goal.po;

import java.sql.Timestamp;

/**
 * 商品品牌model
 * @author lizhiwei
 *
 */
public class Brand {
    private String id;

    private String brandName;

    private String brandDesc;

    private Timestamp createTsp;

    private Timestamp changeTsp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public String getBrandDesc() {
		return brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
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
}