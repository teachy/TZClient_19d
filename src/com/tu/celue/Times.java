package com.tu.celue;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.tu.pojo.TZcelue;

public class Times {
    /**
     * 
    * @Title: getCheckTime 
    * @Description: 时间策略
    * @param @return    设定文件 
    * @return Boolean    返回类型 
    * @throws
     */
	public static Boolean getCheckTime(){
		String currentTime = getTime()+"";
		String[] time0 = TZcelue.getTZ_0().split(",");
		String[] time20 = TZcelue.getTZ_20().split(",");
		String[] time40 = TZcelue.getTZ_40().split(",");
		String[] time60 = TZcelue.getTZ_60().split(",");
		String[] time80 = TZcelue.getTZ_80().split(",");
		String[] time100 = TZcelue.getTZ_100().split(",");
		List<String> list0 = Arrays.asList(time0);
		List<String> list20 = Arrays.asList(time20);
		List<String> list40 = Arrays.asList(time40);
		List<String> list60 = Arrays.asList(time60);
		List<String> list80 = Arrays.asList(time80);
		List<String> list100 = Arrays.asList(time100);
		if(list0.contains(currentTime)){
			return false;
		}else if(list20.contains(currentTime)){
			int i = (int) (Math.random()*10);
			if(i<=1){
				return true;
			}else{
				return false;
			}
		}else if(list40.contains(currentTime)){
			int i = (int) (Math.random()*10);
			if(i<=3){
				return true;
			}else{
				return false;
			}
		}else if(list60.contains(currentTime)){
			int i = (int) (Math.random()*10);
			if(i<=5){
				return true;
			}else{
				return false;
			}
		}else if(list80.contains(currentTime)){
			int i = (int) (Math.random()*10);
			if(i<=7){
				return true;
			}else{
				return false;
			}
		}else if(list100.contains(currentTime)){
			return true;
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
