package com.tu.pojo;

import java.io.Serializable;

public class PTpojo implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String pt_name;//登录名
	private static String pt_pass;//密码
	private static String pt_State;//状态
	public static String getPt_name() {
		return pt_name;
	}
	public static void setPt_name(String ptName) {
		pt_name = ptName;
	}
	public static String getPt_pass() {
		return pt_pass;
	}
	public static void setPt_pass(String ptPass) {
		pt_pass = ptPass;
	}
	public static String getPt_State() {
		return pt_State;
	}
	public static void setPt_State(String ptState) {
		pt_State = ptState;
	}



}
