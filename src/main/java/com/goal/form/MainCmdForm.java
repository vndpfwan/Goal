package com.goal.form;

public class MainCmdForm {

	private String id;
	private String cmdName;
	private CmdPicForm cmdPicForm;
	private CmdParamForm cmdParamForm;
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
	public CmdPicForm getCmdPicForm() {
		return cmdPicForm;
	}
	public void setCmdPicForm(CmdPicForm cmdPicForm) {
		this.cmdPicForm = cmdPicForm;
	}
	public CmdParamForm getCmdParamForm() {
		return cmdParamForm;
	}
	public void setCmdParamForm(CmdParamForm cmdParamForm) {
		this.cmdParamForm = cmdParamForm;
	}
}
