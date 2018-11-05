package com.tu.TZ.BT;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tu.TZ.TZcontrol;
import com.tu.celue.FanBei;
import com.tu.loadWz.BT.LoadingBT;
import com.tu.pojo.TZcelue;
import com.tu.pojo.WZpojo;
import com.tu.suanfa.pl.Pdipl;
import com.tu.util.Checks;
import com.tu.util.JaveScriptEngine;
import com.tu.util.StringUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class BT_tz {
	private static Log log = LogFactory.getLog(BT_tz.class);
	static HttpResponse response = null;
	static double[] d = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
			0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };
	static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
			75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
	static String qihao = "";
	public static String currentNumber = "";
	static Map<Integer, Double> map = new HashMap<Integer, Double>();
	static Map<Integer, Double> map1 = new HashMap<Integer, Double>();
	static List<Integer> listjg = new ArrayList<Integer>();
	static List<BasicNameValuePair> formParams1 = new ArrayList<BasicNameValuePair>();
	static HttpGet get = new HttpGet("http://42.96.205.7:42693/useraccount.php");
	static int errorNum = -1;
	static String pass = "";
	static String hiddenList = "";
	static String hiddenValue = "";

	public static void tz() {
		map.clear();
		String s = "";
		String num = "";
		String res = "";
		formParams1.clear();
		try {
			RequestConfig requestConfig = RequestConfig.custom()
					.setConnectTimeout(5000).setConnectionRequestTimeout(2000)
					.setSocketTimeout(5000).build();
			get.setConfig(requestConfig);
			response = LoadingBT.httpClient.execute(get);
			InputStream instreams = response.getEntity().getContent();
			s = Checks.convertStreamToString(instreams);
			num = (String) StringUtil.getRegexStrs(s,
					"<td><b class=\"red\">(.*)</b></td>").get(2);
			EntityUtils.consume(response.getEntity());
			instreams.close();
			HttpGet get1 = new HttpGet(
					"http://42.96.205.7:42693/game/pc28/getgameinfo.php?g=undefined&p=undefined&timestamp="
							+ new Date().getTime());
			get1.setConfig(requestConfig);
			response = LoadingBT.httpClient.execute(get1);
			res = JaveScriptEngine.getDBE(EntityUtils.toString(response
					.getEntity()));
			JSONObject objs = JSONObject.parseObject(res.split("=")[1]);
			JSONArray array = objs.getJSONArray("uarr");
			for (int i = 0; i < array.size(); i++) {
				JSONObject obj = array.getJSONObject(i);
				if (obj.getString("I").equals("gameinf")) {
					qihao = obj.getString("A").split("@")[0];
				}
			}
			for (int i = 0; i < array.size(); i++) {
				JSONObject obj = array.getJSONObject(i);
				if (obj.getString("I").equals(Integer.parseInt(qihao) - 1 + "")) {
					currentNumber = obj.getString("A").split("@")[8];
				}
			}
			if (listjg.contains(Integer.parseInt(currentNumber))) {
				errorNum = 0;
			} else {
				errorNum++;
			}
			if (errorNum >= 11) {
				errorNum = 0;
			}
			listjg.clear();
			EntityUtils.consume(response.getEntity());
			HttpGet get2 = new HttpGet(
					"http://42.96.205.7:42693/game/pc28/getinser.php?g="
							+ qihao + "?g=undefined&p=undefined&timestamp="
							+ new Date().getTime());
			get2.setConfig(requestConfig);
			response = LoadingBT.httpClient.execute(get2);
			res = JaveScriptEngine.getDBE(EntityUtils.toString(response
					.getEntity()));
			objs = JSONObject.parseObject(res.split("uif=")[1]);
			array = objs.getJSONArray("uarr");
			String time = "";
			if (array != null) {
				for (int i = 0; i < array.size(); i++) {
					JSONObject obj = array.getJSONObject(i);
					if (obj.getString("I").equals("gameinf")) {
						time = obj.getString("A").split("@")[1];
						pass = obj.getString("A").split("@")[13];
						hiddenList = StringUtil.getRegexStr(obj.getString("A")
								.split("@")[14], "name=(\\w+)");
						hiddenValue = StringUtil.getRegexStr(obj.getString("A")
								.split("@")[14], "value=(\\w+)");
					}
				}
				EntityUtils.consume(response.getEntity());
				WZpojo.setTime_kj(Integer.parseInt(time) + "");
				int sleepTime = 0;
				if (WZpojo.isSf_pl()) {
					sleepTime = Integer.parseInt(time) - 125
							- (int) (Math.random() * 10);
				} else {
					sleepTime = (int) (Math.random()
							* (Integer.parseInt(time) - 100) + 20);
				}
				TZcontrol.TZqihao = qihao;
				TZcontrol.setTime(num, sleepTime + "", time);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("获取信息错误：" + e.getMessage(), e);
		} finally {
			try {
				response.getEntity().getContent().close();
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void postData() {
		setJg();
		HttpPost post1 = new HttpPost(
				"http://42.96.205.7:42693/game/pc28/insert.php?gameno=" + qihao
						+ "&act=invest");
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(
				5000).setConnectionRequestTimeout(2000).setSocketTimeout(5000)
				.build();
		post1.setConfig(requestConfig);
			try {
				post1.setEntity(new UrlEncodedFormEntity(formParams1, "gb2312"));
				response = LoadingBT.httpClient.execute(post1);
				EntityUtils.consume(response.getEntity());
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					response.getEntity().getContent().close();
				} catch (UnsupportedOperationException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

	public static void setJg() {
		int tz_js_min = Integer.parseInt(TZcelue.getTZ_js_min());
		int tz_js_max = Integer.parseInt(TZcelue.getTZ_js_max());
		int tz_js_bs = tz_js_max - tz_js_min;
		String res = "";
		JSONArray array;
		JSONObject objs;
		HttpGet get3 = new HttpGet(
				"http://42.96.205.7:42693/game/pc28/gamepl.php?g=" + qihao
						+ "?g=undefined&p=undefined&timestamp="
						+ new Date().getTime());
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(
				5000).setConnectionRequestTimeout(2000).setSocketTimeout(5000)
				.build();
		get3.setConfig(requestConfig);
		try {
			response = LoadingBT.httpClient.execute(get3);
			res = JaveScriptEngine.getDBE(EntityUtils.toString(response
					.getEntity()));
			EntityUtils.consume(response.getEntity());
			objs = JSONObject.parseObject(res.split("uif=")[1]);
			array = objs.getJSONArray("odds");
			JSONObject obj = array.getJSONObject(0);
			for (int i = 0; i <= 27; i++) {
				if (i <= 13)
					map.put(Integer.valueOf(i), Double.valueOf(d[i]
							* obj.getDoubleValue("N" + i)));
				else {
					map.put(Integer.valueOf(i), Double.valueOf(d[(27 - i)]
							* obj.getDoubleValue("N" + i)));
				}
			}
			// *************************************************//
			TZcontrol.setJg(map, map1, listjg,currentNumber);
			map1.clear();
			Pdipl.savePl(map, map1);
			// *************************************************//
			Collections.sort(listjg);
			int sum = 0;
			int betting = (int) (Math.random() * tz_js_bs + tz_js_min);
			betting = FanBei.getBetting(betting, errorNum);
			for (int ii = 0; ii < listjg.size(); ii++) {
				sum += bet[listjg.get(ii)];
			}
			int[] betting1 = new int[28];
			int fenshu = betting / sum;
			for (int i = 0; i <= 27; i++) {
				if (listjg.contains(Integer.valueOf(i))) {
					betting1[i] = (bet[i] * fenshu);
				}
			}
			int sum1 = 0;
			for (int i = 0; i <= 27; i++) {
				sum1 += betting1[i];
			}
			formParams1.add(new BasicNameValuePair("umod", pass));
			formParams1.add(new BasicNameValuePair(hiddenList, hiddenValue));
			formParams1.add(new BasicNameValuePair("tbTotalG1", sum1 + ""));
			for (int i = 0; i <= 27; i++) {
				if (listjg.contains(Integer.valueOf(i))) {
					betting1[i] = (bet[i] * fenshu);
					formParams1.add(new BasicNameValuePair("tbChk" + i, "on"));
					formParams1.add(new BasicNameValuePair("tbNum" + i,
							betting1[i] + ""));
				} else {
					formParams1.add(new BasicNameValuePair("tbNum" + i, ""));
				}
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}