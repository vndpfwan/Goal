package com.goal.form;

public class CmdPicForm {

	private String id;
	private String picUrl;
	private String picIndex;
	private String showAs;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicIndex() {
		return picIndex;
	}
	public void setPicIndex(String picIndex) {
		this.picIndex = picIndex;
	}
	public String getShowAs() {
		return showAs;
	}
	public void setShowAs(String showAs) {
		this.showAs = showAs;
	}
	@Override
	public String toString() {
		return "CmdPicForm [id=" + id + ", picUrl=" + picUrl + ", picIndex=" + picIndex + ", showAs=" + showAs + "]";
	}
	
}
