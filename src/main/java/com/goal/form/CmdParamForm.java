package com.goal.form;



public class CmdParamForm {

	//智能类型
	private String smartType;
	//质保
	private String warranty;
	//颜色及型号
	private String size;
	//照射面积
	private String area;
	//光源类型
	private String source;
	//功率
	private String power;
	//适用空间
	private String space;
	//风格
	private String style;
	//形状
	private String shape;
	//销量
	private String sale;
	public String getSmartType() {
		return smartType;
	}
	public void setSmartType(String smartType) {
		this.smartType = smartType;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "CmdParamForm [smartType=" + smartType + ", warranty=" + warranty + ", size=" + size + ", area=" + area
				+ ", source=" + source + ", power=" + power + ", space=" + space + ", style=" + style + ", shape="
				+ shape + ", sale=" + sale + "]";
	}
	
}
