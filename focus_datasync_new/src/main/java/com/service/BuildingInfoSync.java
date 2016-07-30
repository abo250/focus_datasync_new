package com.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.bean.BuildingDetailInfo;
import com.bean.BuildingMainInfo;
import com.bean.JsonBean;
import com.bean.JsonBean2;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class BuildingInfoSync {
	private final static String URLSTR = "http://outside.newhouse.focus.cn/data/sohu/newhouse.txt";
	public static void main(String[] args) {
		
		dataTolocal(args[0]);
	}
	public static void dataTolocal(String data){
		String tempString = null;
		String outPath="d:\\buildinginfo.txt";
		try {
			URL url = new URL(URLSTR);
			URLConnection con = url.openConnection();
			Map<Integer,Object> resm = new HashMap<Integer, Object>();
			int counter =0;
			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()), 5 * 1024 * 1024);
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outPath))); 
			BuildingMainInfo bmi = null;
			BuildingDetailInfo bdi = null;
			while ((tempString = reader.readLine()) != null) {
				counter++;
				resm = jsonToString(tempString);
				if(resm.containsKey(1)){
					JsonBean jbean = (JsonBean) resm.get(1);
					bmi = jbean.getBuildingMainInfo();
					bdi = jbean.getBuildingDetailInfo();
				}else{
					JsonBean2 jbean2 = (JsonBean2) resm.get(2);
					bmi = jbean2.getBuildingMainInfo();
					bdi = jbean2.getBuildingDetailInfo();
				}
				
				if(bmi!=null){
					writer.write(bmi.getBuildingId()==null?"":bmi.getBuildingId().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getBuildingName()==null?"":bmi.getBuildingName().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getBuildingAlias()==null?"":bmi.getBuildingAlias().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getPosx()==null?"":bmi.getPosx().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getPosy()==null?"":bmi.getPosy().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getProvinceId()==null?"":bmi.getProvinceId().replaceAll( "\\s*|\t|\r|\n ", " " )+"\t");
					writer.write(bmi.getCityName()==null?"":bmi.getCityName().replaceAll( "\\s*|\t|\r|\n", "" )+"\t");
					writer.write(bmi.getAreaId()==null?"":bmi.getAreaId().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getPlateName()==null?"":bmi.getPlateName().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getOpeningTime()==null?"":bmi.getOpeningTime().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getLastRefPrice()==null?"":bmi.getLastRefPrice().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getPropertyAddress()==null?"":bmi.getPropertyAddress().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getBuildingFlavour()==null?"":bmi.getBuildingFlavour().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getPropertyType()==null?"":bmi.getPropertyType().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bmi.getBuildingType()==null?"":bmi.getBuildingType().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					
				}if(bdi!=null){
					writer.write(bdi.getDeveloperName()==null?"":bdi.getDeveloperName().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getRingPosition()==null?"":bdi.getRingPosition().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getDeliveryTime()==null?"":bdi.getDeliveryTime().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getRightLimit()==null?"":bdi.getRightLimit().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getTotalCoverSize()==null?"":bdi.getTotalCoverSize().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getTotalBuildingSize()==null?"":bdi.getTotalBuildingSize().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getGreenRate()==null?"":bdi.getGreenRate().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getVolumeRate()==null?"":bdi.getVolumeRate().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getPropertyCompany()==null?"":bdi.getPropertyCompany()==null?"":bdi.getPropertyCompany().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getPropertyFee()==null?"":bdi.getPropertyFee().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getParkingRate()==null?"":bdi.getParkingRate().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getMunicipalPlanning()==null?"":bdi.getMunicipalPlanning().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getBuildingIntroduction()==null?"":bdi.getBuildingIntroduction().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getLastDecorate()==null?"":bdi.getLastDecorate().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getSaleOfficeAddress()==null?"":bdi.getSaleOfficeAddress().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getSaleOfficeTel()==null?"":bdi.getSaleOfficeTel().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getTotalHouse()==null?"":bdi.getTotalHouse().replaceAll( "\\s*|\t|\r|\n", " " )+"\t");
					writer.write(bdi.getSalesLicense()==null?"":bdi.getSalesLicense().replaceAll( "\\s*|\t|\r|\n", " " ));
				}else{
					for(int i=0;i<17;i++){
						writer.write("\t");
					}
				}
				writer.write("\n");
				writer.flush();
				
			}
			writer.close();
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
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

}
