/**
 * 
 */
package com.goal.form;

/**
 * @author McGee
 *
 */
public class CmdParamsForm {

	private String attrTitle;
	private String attrInfo;
	
	public String getAttrTitle() {
		return attrTitle;
	}
	public void setAttrTitle(String attrTitle) {
		this.attrTitle = attrTitle;
	}
	public String getAttrInfo() {
		return attrInfo;
	}
	public void setAttrInfo(String attrInfo) {
		this.attrInfo = attrInfo;
	}
	@Override
	public String toString() {
		return "CmdParamsForm [attrTitle=" + attrTitle + ", attrInfo=" + attrInfo + "]";
	}
}
