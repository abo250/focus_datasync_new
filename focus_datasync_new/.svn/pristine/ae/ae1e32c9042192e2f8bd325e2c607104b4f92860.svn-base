package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;


public class TestMain {

	public static void main(String[] args) {
		String urlStr = "http://outside.newhouse.focus.cn/data/sohu/newhouse.txt";
		String tempString = null;
		Map<Integer,Object> resm = new HashMap<Integer, Object>();
		int counter =0;
		try {
			URL url = new URL(urlStr);
			URLConnection con = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()), 5 * 1024 * 1024);
			while ((tempString = reader.readLine()) != null) {
				counter++;
				resm = jsonToString(tempString);
				if(resm.containsKey(1)){
					JsonBean jbean = (JsonBean) resm.get(1);
					System.out.println(counter+"@"+jbean.getBuildingMainInfo().getBuildingId());
					System.out.println(jbean.getBuildingMainInfo().getBuildingName());
				}else{
					JsonBean2 jbean2 = (JsonBean2) resm.get(2);
					System.out.println(counter+"@"+jbean2.getBuildingMainInfo().getBuildingId());
					System.out.println(jbean2.getBuildingMainInfo().getBuildingName());
				}
			}
			

			reader.close();
		} catch (Exception e) {
			System.out.println("tempString:====" + tempString);
		}

	}
	
	
	public static Map<Integer,Object> jsonToString(String dataString) {
		JsonBean jbean = null;
		JsonBean2 jbean2 = null;
		Map<Integer,Object> resultMap = new HashMap<Integer,Object>();
		java.lang.reflect.Type type = new TypeToken<JsonBean>() {}.getType();
		java.lang.reflect.Type type2 = new TypeToken<JsonBean2>() {}.getType();
		Gson gson = new Gson();
		try {
			  jbean = gson.fromJson(dataString, type);
			  resultMap.put(1, jbean);
		} catch (Exception e) {
			System.out.println("dataString==="+dataString);
			jbean2 = gson.fromJson(dataString, type2);
			resultMap.put(2, jbean2);
		}
		return resultMap;
	}
	
	
//	public static JsonBean jsonToString2(String dataString) {
//		JsonBean jbean = null;
//		java.lang.reflect.Type type = new TypeToken<JsonBean>() {}.getType();
//		Gson gson = new Gson();
//		try {
//			  jbean = gson.fromJson(dataString, type);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return jbean;
//	}

	public static class JsonBean {
		@SerializedName("buildingMainInfo")
		private BuildingMainInfo buildingMainInfo;
		@SerializedName("buildingDetailInfo")
		private BuildingDetailInfo buildingDetailInfo;
		@SerializedName("picInfo")
		private List<PicInfo> picInfo;
		@SerializedName("apartment")
		private List<Apartment> apartments;
		@SerializedName("opengningInfo")
		private List<OpengningInfo> opengningInfos;
		@SerializedName("buildingInfo")
		private List<BuildingInfo> buildingInfos;

		public BuildingMainInfo getBuildingMainInfo() {
			return buildingMainInfo;
		}

		public void setBuildingMainInfo(BuildingMainInfo buildingMainInfo) {
			this.buildingMainInfo = buildingMainInfo;
		}

		public BuildingDetailInfo getBuildingDetailInfo() {
			return buildingDetailInfo;
		}

		public void setBuildingDetailInfo(BuildingDetailInfo buildingDetailInfo) {
			this.buildingDetailInfo = buildingDetailInfo;
		}

		public List<PicInfo> getPicInfo() {
			return picInfo;
		}

		public void setPicInfo(List<PicInfo> picInfo) {
			this.picInfo = picInfo;
		}

		public List<Apartment> getApartments() {
			return apartments;
		}

		public void setApartments(List<Apartment> apartments) {
			this.apartments = apartments;
		}

		public List<OpengningInfo> getOpengningInfos() {
			return opengningInfos;
		}

		public void setOpengningInfos(List<OpengningInfo> opengningInfos) {
			this.opengningInfos = opengningInfos;
		}

		public List<BuildingInfo> getBuildingInfos() {
			return buildingInfos;
		}

		public void setBuildingInfos(List<BuildingInfo> buildingInfos) {
			this.buildingInfos = buildingInfos;
		}

	}
	
	
	public static class JsonBean2 {
		@SerializedName("buildingMainInfo")
		private BuildingMainInfo buildingMainInfo;
		@SerializedName("buildingDetailInfo")
		private BuildingDetailInfo buildingDetailInfo;
		@SerializedName("picInfo")
		private List<PicInfo> picInfo;
		@SerializedName("apartment")
		private List<Apartment> apartments;
		@SerializedName("opengningInfo")
		private List<OpengningInfo> opengningInfos;
		@SerializedName("buildingInfo")
		private BuildingInfo buildingInfos;

		public BuildingMainInfo getBuildingMainInfo() {
			return buildingMainInfo;
		}

		public void setBuildingMainInfo(BuildingMainInfo buildingMainInfo) {
			this.buildingMainInfo = buildingMainInfo;
		}

		public BuildingDetailInfo getBuildingDetailInfo() {
			return buildingDetailInfo;
		}

		public void setBuildingDetailInfo(BuildingDetailInfo buildingDetailInfo) {
			this.buildingDetailInfo = buildingDetailInfo;
		}

		public List<PicInfo> getPicInfo() {
			return picInfo;
		}

		public void setPicInfo(List<PicInfo> picInfo) {
			this.picInfo = picInfo;
		}

		public List<Apartment> getApartments() {
			return apartments;
		}

		public void setApartments(List<Apartment> apartments) {
			this.apartments = apartments;
		}

		public List<OpengningInfo> getOpengningInfos() {
			return opengningInfos;
		}

		public void setOpengningInfos(List<OpengningInfo> opengningInfos) {
			this.opengningInfos = opengningInfos;
		}

		public BuildingInfo getBuildingInfos() {
			return buildingInfos;
		}

		public void setBuildingInfos(BuildingInfo buildingInfos) {
			this.buildingInfos = buildingInfos;
		}

	}

	public static class BuildingMainInfo {
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

	public static class BuildingDetailInfo {
		private String buildingId;// 楼盘ID（GroupId）
		private String developerName;// 开发商名称
		private String ringPosition;// 环线
		private String deliveryTime;// 入住时间
		private String rightLimit;// 产权年限
		private String totalCoverSize;// 占地面积
		private String totalBuildingSize; // 建筑面积
		private String greenRate;// 绿化率
		private String volumeRate;// 容积率
		private String propertyCompany;// 物业公司
		private String propertyFee;// 物业费
		private String parkingRate;// 车位描述
		private String municipalPlanning;// 项目配套（周边配套）
		private String buildingIntroduction;// 楼盘简介
		private String lastDecorate;// 装修情况
		private String saleOfficeAddress;// 售楼处地址
		private String saleOfficeTel;// 售楼处电话
		private String totalHouse;// 楼座展示
		private String salesLicense;// 销售许可证

		public String getBuildingId() {
			return buildingId;
		}

		public void setBuildingId(String buildingId) {
			this.buildingId = buildingId;
		}

		public String getDeveloperName() {
			return developerName;
		}

		public void setDeveloperName(String developerName) {
			this.developerName = developerName;
		}

		public String getRingPosition() {
			return ringPosition;
		}

		public void setRingPosition(String ringPosition) {
			this.ringPosition = ringPosition;
		}

		public String getDeliveryTime() {
			return deliveryTime;
		}

		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		public String getRightLimit() {
			return rightLimit;
		}

		public void setRightLimit(String rightLimit) {
			this.rightLimit = rightLimit;
		}

		public String getTotalCoverSize() {
			return totalCoverSize;
		}

		public void setTotalCoverSize(String totalCoverSize) {
			this.totalCoverSize = totalCoverSize;
		}

		public String getTotalBuildingSize() {
			return totalBuildingSize;
		}

		public void setTotalBuildingSize(String totalBuildingSize) {
			this.totalBuildingSize = totalBuildingSize;
		}

		public String getGreenRate() {
			return greenRate;
		}

		public void setGreenRate(String greenRate) {
			this.greenRate = greenRate;
		}

		public String getVolumeRate() {
			return volumeRate;
		}

		public void setVolumeRate(String volumeRate) {
			this.volumeRate = volumeRate;
		}

		public String getPropertyCompany() {
			return propertyCompany;
		}

		public void setPropertyCompany(String propertyCompany) {
			this.propertyCompany = propertyCompany;
		}

		public String getPropertyFee() {
			return propertyFee;
		}

		public void setPropertyFee(String propertyFee) {
			this.propertyFee = propertyFee;
		}

		public String getParkingRate() {
			return parkingRate;
		}

		public void setParkingRate(String parkingRate) {
			this.parkingRate = parkingRate;
		}

		public String getMunicipalPlanning() {
			return municipalPlanning;
		}

		public void setMunicipalPlanning(String municipalPlanning) {
			this.municipalPlanning = municipalPlanning;
		}

		public String getBuildingIntroduction() {
			return buildingIntroduction;
		}

		public void setBuildingIntroduction(String buildingIntroduction) {
			this.buildingIntroduction = buildingIntroduction;
		}

		public String getLastDecorate() {
			return lastDecorate;
		}

		public void setLastDecorate(String lastDecorate) {
			this.lastDecorate = lastDecorate;
		}

		public String getSaleOfficeAddress() {
			return saleOfficeAddress;
		}

		public void setSaleOfficeAddress(String saleOfficeAddress) {
			this.saleOfficeAddress = saleOfficeAddress;
		}

		public String getSaleOfficeTel() {
			return saleOfficeTel;
		}

		public void setSaleOfficeTel(String saleOfficeTel) {
			this.saleOfficeTel = saleOfficeTel;
		}

		public String getTotalHouse() {
			return totalHouse;
		}

		public void setTotalHouse(String totalHouse) {
			this.totalHouse = totalHouse;
		}

		public String getSalesLicense() {
			return salesLicense;
		}

		public void setSalesLicense(String salesLicense) {
			this.salesLicense = salesLicense;
		}
	}

	public static class PicInfo {

		private String picType;//图片类型
		private String picTitle;//图片名称
		private String picUrl;//图片url

		public String getPicType() {
			return picType;
		}

		public void setPicType(String picType) {
			this.picType = picType;
		}

		public String getPicTitle() {
			return picTitle;
		}

		public void setPicTitle(String picTitle) {
			this.picTitle = picTitle;
		}

		public String getPicUrl() {
			return picUrl;
		}

		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
	}

	public static class Apartment {
		private String apartmentName;// 户型名称
		private String apartmentPicUrl;// 户型图片
		private String houseSize;// 室内面积
		private String isMain;// 是否主力
		private String status;// 销售状态
		private String totalHal;// 厅
		private String totalRoom;// 室
		private String totalToilet;// 卫
		private String totalSize;// 总面积

		public String getApartmentName() {
			return apartmentName;
		}

		public void setApartmentName(String apartmentName) {
			this.apartmentName = apartmentName;
		}

		public String getApartmentPicUrl() {
			return apartmentPicUrl;
		}

		public void setApartmentPicUrl(String apartmentPicUrl) {
			this.apartmentPicUrl = apartmentPicUrl;
		}

		public String getHouseSize() {
			return houseSize;
		}

		public void setHouseSize(String houseSize) {
			this.houseSize = houseSize;
		}

		public String getIsMain() {
			return isMain;
		}

		public void setIsMain(String isMain) {
			this.isMain = isMain;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTotalHal() {
			return totalHal;
		}

		public void setTotalHal(String totalHal) {
			this.totalHal = totalHal;
		}

		public String getTotalRoom() {
			return totalRoom;
		}

		public void setTotalRoom(String totalRoom) {
			this.totalRoom = totalRoom;
		}

		public String getTotalToilet() {
			return totalToilet;
		}

		public void setTotalToilet(String totalToilet) {
			this.totalToilet = totalToilet;
		}

		public String getTotalSize() {
			return totalSize;
		}

		public void setTotalSize(String totalSize) {
			this.totalSize = totalSize;
		}

	}

	public static class OpengningInfo {
		private String openingTime; // 开盘时间
		private String description;// 开盘描述
		private String price;// 开盘价格

		public String getOpeningTime() {
			return openingTime;
		}

		public void setOpeningTime(String openingTime) {
			this.openingTime = openingTime;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}
	}

	public static class BuildingInfo {
		String picUrl; // 楼座图片url
		@SerializedName("mapList")
		List<MapList> mapList;// 标点的楼座

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
	
	public static class MapList {
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

}
