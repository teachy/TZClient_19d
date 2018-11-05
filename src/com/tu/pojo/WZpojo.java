package com.tu.pojo;

import java.io.Serializable;

public class WZpojo implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String wz_name;//登录名
	private static String wz_pass;//密码
	private static String wz_State;//状态
    private static String wz_id;//获取的id
    private static String wz_gold;//获取的金币
    private static String wz_index;//网站id
    private static String wz_tz_index;//网站游戏
    private static boolean sf_pl;//是否为赔率算法
    private static String wz_sf_index;//sf的id
    private static String time_kj;//开始时间
    private static String time_tz;//投注时间
    private static String wz_code;//投注时间
	public static String getWz_name() {
		return wz_name;
	}
	public static void setWz_name(String wzName) {
		wz_name = wzName;
	}
	public static String getWz_pass() {
		return wz_pass;
	}
	public static void setWz_pass(String wzPass) {
		wz_pass = wzPass;
	}
	public static String getWz_State() {
		return wz_State;
	}
	public static void setWz_State(String wzState) {
		wz_State = wzState;
	}
	public static String getWz_id() {
		return wz_id;
	}
	public static void setWz_id(String wzId) {
		wz_id = wzId;
	}
	public static String getWz_gold() {
		return wz_gold;
	}
	public static void setWz_gold(String wzGold) {
		wz_gold = wzGold;
	}
	public static String getWz_index() {
		return wz_index;
	}
	public static void setWz_index(String wzIndex) {
		wz_index = wzIndex;
	}
	public static String getWz_tz_index() {
		return wz_tz_index;
	}
	public static void setWz_tz_index(String wzTzIndex) {
		wz_tz_index = wzTzIndex;
	}
	public static boolean isSf_pl() {
		return sf_pl;
	}
	public static void setSf_pl(boolean sfPl) {
		sf_pl = sfPl;
	}
	public static String getWz_sf_index() {
		return wz_sf_index;
	}
	public static void setWz_sf_index(String wzSfIndex) {
		wz_sf_index = wzSfIndex;
	}
	public static String getTime_kj() {
		return time_kj;
	}
	public static void setTime_kj(String timeKj) {
		time_kj = timeKj;
	}
	public static String getTime_tz() {
		return time_tz;
	}
	public static void setTime_tz(String timeTz) {
		time_tz = timeTz;
	}
	public static String getWz_code() {
		return wz_code;
	}
	public static void setWz_code(String wzCode) {
		wz_code = wzCode;
	}
	
    
}
