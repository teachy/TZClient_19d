package com.tu.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {



	/**
	 * 根据正则表达式获取匹配的字符串 只获取括号中的第一个
	 * 
	 * @Title: getRegexStr
	 * @param @return
	 * @return String
	 * @throws
	 */
	public static String getRegexStr(String sourceStr, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sourceStr);
		if (m.find()) {
			return m.group(1);
		}

		return null;
	}

	/**
	 * 
	* @Title: getCurrentTime 
	* @Description: 得到当天日期
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws
	 */
    public static String getCurrentTime(){
        SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");  
        String time = f.format(new Date()); 
        return time;
    }

	/**
	 * 
	 * @Title: getRegexStrs
	 * @Description: 根据正则返回字符串匹配的所有集合
	 * @param @param sourceStr
	 * @param @param regex
	 * @param @return 设定文件
	 * @return Set<String> 返回类型
	 * @throws
	 */
	public static List<String> getRegexStrs(String sourceStr, String regex) {
		List<String> list = new ArrayList<String>();
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(sourceStr);
		while (m.find()) {
			list.add(m.group(1));
		}
		return list;
	}
	
    public static String getRegexStr1(String sourceStr, String regex) {
        Pattern p = Pattern.compile(regex,Pattern.DOTALL);
        Matcher m = p.matcher(sourceStr);
        if (m.find()) {
            return m.group(1);
        }

        return null;
    }

}
