package com.tu.celue;

import com.tu.pojo.TZcelue;
import com.tu.pojo.WZpojo;

public class Gold {
	/**
	 * 
	* @Title: checkGold 
	* @Description: 检查金币策略
	* @param @param gold_sum
	* @return boolean    返回类型 
	* @throws
	 */
   public static boolean checkGold(){
	   if(WZpojo.getWz_gold().isEmpty()){
		   return false;
	   }else{
		   String current_gold = WZpojo.getWz_gold().replaceAll("[,.]", "");
		   int gold = Integer.parseInt(current_gold);
		   int min = Integer.parseInt(TZcelue.getGold_min());
		   int max = Integer.parseInt(TZcelue.getGold_max());
		   if(gold<max&&gold>min){
			   return true;
		   }else{
			   return false;
		   }
	   }
   }
}
