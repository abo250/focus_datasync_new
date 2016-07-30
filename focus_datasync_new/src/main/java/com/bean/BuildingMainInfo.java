package com.bean;

public class BuildingMainInfo {

	private String buildingId; //楼盘ID（GroupId）
	private String buildingName; //楼盘名称
	private String buildingAlias; //楼盘别名
	private String posx; //纬度
	private String posy; //经度
	private String provinceId; //省份对应code(高德)
	private String cityName;//城市名称
	private String areaId;//地区对应code(高德)
	private String plateName;//商圈名称
	private String salePhase;//销售状态
	private String openingTime;//最新开盘时间
	private String lastRefPrice;//最新均价
	private String propertyAddress;//楼盘地址
	private String buildingFlavour;//楼盘特色
	private String propertyType;//楼盘类型
	private String buildingType;//建筑类型

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingAlias() {
		return buildingAlias;
	}

	public void setBuildingAlias(String buildingAlias) {
		this.buildingAlias = buildingAlias;
	}

	public String getPosx() {
		return posx;
	}

	public void setPosx(String posx) {
		this.posx = posx;
	}

	public String getPosy() {
		return posy;
	}

	public void setPosy(String posy) {
		this.posy = posy;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getPlateName() {
		return plateName;
	}

	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}

	public String getSalePhase() {
		return salePhase;
	}

	public void setSalePhase(String salePhase) {
		this.salePhase = salePhase;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public String getLastRefPrice() {
		return lastRefPrice;
	}

	public void setLastRefPrice(String lastRefPrice) {
		this.lastRefPrice = lastRefPrice;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public String getBuildingFlavour() {
		return buildingFlavour;
	}

	public void setBuildingFlavour(String buildingFlavour) {
		this.buildingFlavour = buildingFlavour;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}


}
