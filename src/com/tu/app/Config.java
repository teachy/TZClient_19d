package com.tu.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Config {
	private static Properties configs = new Properties();
	private static String filePath=System.getProperty("user.dir") + "/properties/config.properties";
	static {
		File f = new File(filePath);
		FileInputStream inpf = null;
		try {
			inpf = new FileInputStream(f);
			configs.load(inpf);
		} catch (Exception e) {
		} finally {
			if (inpf != null) {
				try {
					inpf.close();
				} catch (IOException e) {
				}
			}
		}
	}
	public static String PT_username = getString("PT_username");
	public static String PT_password = getString("PT_password");
	public static String WZ_username = getString("WZ_username");
	public static String WZ_password = getString("WZ_password");
	public static String XZWZ = getString("XZWZ");
	public static String XZYX = getString("XZYX");
	public static String PTSF = getString("PTSF");
	public static String PLSF = getString("PLSF");
	public static String gold_min = getString("gold_min");
	public static String gold_max = getString("gold_max");
	public static String time_0 = getString("time_0");
	public static String time_20 = getString("time_20");
	public static String time_40 = getString("time_40");
	public static String time_60 = getString("time_60");
	public static String time_80 = getString("time_80");
	public static String time_100 = getString("time_100");
	public static String TZJS = getString("TZJS");
	public static String FB_1 = getString("FB_1");
	public static String FB_2 = getString("FB_2");
	public static String FB_3 = getString("FB_3");
	public static String FB_4 = getString("FB_4");
	public static String FB_5 = getString("FB_5");
	public static String FB_6 = getString("FB_6");
	public static String FB_7 = getString("FB_7");
	public static String FB_8 = getString("FB_8");
	public static String FB_9 = getString("FB_9");
	public static String FB_10 = getString("FB_10");
	public static String my_QQ = getString("my_QQ");
	public static String my_href = getString("my_href");
	public static String TZ_js_min = getString("TZ_js_min");
	public static String TZ_js_max = getString("TZ_js_max");
	public static String QJ_GL = getString("QJ_GL");


	private static String getString(String name) {
		return configs.get(name).toString().trim();
	}
	
    /**
	    * 更新properties文件的键值对
	    * 如果该主键已经存在，更新该主键的值；
	    * 如果该主键不存在，则插件一对键值。
	    * @param keyname 键名
	    * @param keyvalue 键值
	    */
	   public static void updateProperties(String keyname,String keyvalue) {
	        try {
	            OutputStream fos = new FileOutputStream(filePath);           
	            configs.setProperty(keyname, keyvalue);
	            configs.store(fos, "Update '" + keyname + "' value");
	        } catch (IOException e) {
	            System.err.println("属性文件更新错误");
	        }
	    }
	    public static void main(String[] args) {
	    	updateProperties("gold_min","123");
		}
}
