package com.goal.form;


public class CmdDetailForm {

	private String id;
	private String cmdName;
	private String cmdDesc;
	private String cmdPrice;
	private String brandName;
	private String typeName;
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
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "CmdDetailForm [id=" + id + ", cmdName=" + cmdName + ", cmdDesc=" + cmdDesc + ", cmdPrice=" + cmdPrice
				+ ", brandName=" + brandName + ", typeName=" + typeName + "]";
	}
	
}
