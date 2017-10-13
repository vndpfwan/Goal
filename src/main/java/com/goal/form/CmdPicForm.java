package com.goal.form;

public class CmdPicForm {

	private String id;
	private String picURL;
	private String picIndex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicURL() {
		return picURL;
	}
	public void setPicURL(String picURL) {
		this.picURL = picURL;
	}
	public String getPicIndex() {
		return picIndex;
	}
	public void setPicIndex(String picIndex) {
		this.picIndex = picIndex;
	}
	@Override
	public String toString() {
		return "CmdPicForm [id=" + id + ", picURL=" + picURL + ", picIndex=" + picIndex + "]";
	}
	
}
