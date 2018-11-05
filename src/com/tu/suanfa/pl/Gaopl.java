package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Gaopl {
	static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
		75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
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
		int sum = 0;
		Collections.sort(list);
		for (int i = 27; i >=0; i--) {
			for (Map.Entry<Integer, Double> m : map.entrySet()) {
				if (m.getValue() == list.get(i)) {
					sum = sum + bet[m.getKey()];
					listjg.add(m.getKey());
					break;
				}

			}
			if (sum >= 450) {
				break;
			}
		}
	}
}
