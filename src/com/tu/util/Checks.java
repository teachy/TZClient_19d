package com.tu.util;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Checks {
	public static int jishuqi=0;
	private static Log log = LogFactory.getLog(Checks.class);

	public static String convertStreamToString(InputStream is) {
		StringBuilder sb1 = new StringBuilder();
		byte[] bytes = new byte[4096];
		int size = 0;

		try {
			while ((size = is.read(bytes)) > 0) {
				String str = new String(bytes, 0, size, "gb2312");
				sb1.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb1.toString();
	}

	public static void countDown(int seconds) throws InterruptedException {
		log.info("倒计时" + seconds + "秒,倒计时开始:");
		int i = seconds;
		while (i > 0) {
			Thread.sleep(1000);
			i--;
		}
		log.info("倒计时结束");
	}

	public static Boolean getCheckTime(){
		int check = (int) (Math.random()*40);
		if(check<=2){
			return false;
		}
		if(CheckTime1()||CheckTime2()||CheckTime3()){
			return false;
		}
		return true;
	}
	/**
	 * 
	* @Title: CheckTime1 
	* @Description: 凌晨以后（睡觉）
	* @param @return    设定文件 
	* @return Boolean    返回类型 
	* @throws
	 */
	public static Boolean CheckTime1(){
		int h=getTime();
		if(h<8){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 
	* @Title: CheckTime2 
	* @Description: 中午或者下午 
	* @param @return    设定文件 
	* @return Boolean    返回类型 
	* @throws
	 */
	public static Boolean CheckTime2(){
		int h=getTime();
		if((h>12&&h<13)||(h>18&&h<19)){
			int check = (int) (Math.random()*20);
			if(check<10){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}
	
	/**
	 * 
	* @Title: CheckTime3 
	* @Description: 中途有事情
	* @param     设定文件 
	* @return void    返回类型 
	* @throws
	 */
	public static Boolean CheckTime3(){
		int h=getTime();
		if(h>8&&h<23){
			if(jishuqi<=0){
				jishuqi = (int) (Math.random()*120);
				if(jishuqi>8){
					jishuqi=0;
				}
				return false;
			}else{
				jishuqi--;
				return true;
			}
		}else{
			return false;
		}
	}
	
	/**
	 * 
	* @Title: getTime 
	* @Description: 得到当前小时 
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
	public static int getTime(){
		Date currentTime = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String time = format.format(currentTime);
		int h = Integer.parseInt(time.split(":")[0]);
		return h;
	}
}
