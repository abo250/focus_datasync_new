package com.bean;

public class MapList {

	private String buildingId;//楼座Id
	private String title;//楼座标题
	private String top;//以左上角为圆心，向下的像素
	private String left;//以左上角为圆心，向右的像素

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getLeft() {
		return left;
	}

	public void setLeft(String left) {
		this.left = left;
	}
}
