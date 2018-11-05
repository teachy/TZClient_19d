package com.tu.suanfa.pl;

import java.util.List;
import java.util.Map;

public class Pdipl {
	/**
	 * 
	* @Title: getNumbers 
	* @Description: 得到与上期相比偏小的结果
	* @param @param map    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public static void getNumbers(Map<Integer, Double> map,List<Integer> listjg,Map<Integer, Double> map1) {
		for (Map.Entry<Integer, Double> m : map.entrySet()) {
			if(m.getValue()< map1.get(m.getKey())){
				listjg.add(m.getKey());
			}
		}
	}
	
	
	/**
	 * 
	* @Title: savePl 
	* @Description: 保存上期赔率
	* @param @param map    设定文件 
	* @return void    返回类型 
	 */
	public static void savePl(Map<Integer, Double> map,Map<Integer, Double> map1) {
		map1.clear();
		for (Map.Entry<Integer, Double> m : map.entrySet()) {
			map1.put(m.getKey(), m.getValue());
		}
	}
}
