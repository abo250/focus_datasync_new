package com.bean;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class BuildingInfo {

	String picUrl; // Â¥×ùÍ¼Æ¬url
	@SerializedName("mapList")
	List<MapList> mapList;// ±êµãµÄÂ¥×ù

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public List<MapList> getMapList() {
		return mapList;
	}

	public void setMapList(List<MapList> mapList) {
		this.mapList = mapList;
	}
}
