package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Zhongpl {
	/**
	 * 
	* @Title: getNumbers 
	* @Description: 得到赔率偏大的结果
	* @param @param map    设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public static void getNumbers(Map<Integer, Double> map,List<Integer> listjg) {
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i <= 27; i++) {
			list.add((Double) map.get(Integer.valueOf(i)));
		}
		Collections.sort(list);
		for (int i = 2; i <= 25; i++) {
			for (Map.Entry<Integer, Double> m : map.entrySet()) {
				if (m.getValue() == list.get(i)) {
					listjg.add(m.getKey());
					break;
				}

			}
		}
	}
}
