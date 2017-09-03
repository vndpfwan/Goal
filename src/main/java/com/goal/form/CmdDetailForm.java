package com.goal.form;

import java.sql.Date;
import java.util.List;

public class CmdDetailForm {

	private String id;
	private String cmdName;
	private String cmdDesc;
	private String cmdPrice;
	private List<CmdPicForm> cmdPics;
	private List<CmdParamForm> cmdParams;
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
	public List<CmdPicForm> getCmdPics() {
		return cmdPics;
	}
	public void setCmdPics(List<CmdPicForm> cmdPics) {
		this.cmdPics = cmdPics;
	}
	public List<CmdParamForm> getCmdParams() {
		return cmdParams;
	}
	public void setCmdParams(List<CmdParamForm> cmdParams) {
		this.cmdParams = cmdParams;
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
	
}
