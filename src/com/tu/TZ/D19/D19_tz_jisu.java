package com.tu.TZ.D19;

import com.alibaba.fastjson.JSONObject;
import com.tu.TZ.TZcontrol;
import com.tu.celue.FanBei;
import com.tu.loadWz.D19.Loading19D;
import com.tu.pojo.TZcelue;
import com.tu.pojo.WZpojo;
import com.tu.suanfa.pl.GM;
import com.tu.suanfa.pl.GM1;
import com.tu.suanfa.pl.GM2;
import com.tu.suanfa.pl.GM3;
import com.tu.suanfa.pl.Pdipl;
import com.tu.util.StringUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class D19_tz_jisu {
	static HttpResponse response = null;
	static double[] d = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
			0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };
	static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
			75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
	static String qihao = "";
	static String currentNumber = "";
	static Map<Integer, Double> map = new HashMap<Integer, Double>();
	static Map<Integer, Double> map1 = new HashMap<Integer, Double>();
	static List<Integer> resList = new LinkedList<Integer>();
	static List<Integer> listjg_1 = new ArrayList<Integer>();
	static List<Integer> listjg = new ArrayList<Integer>();
	static StringBuffer bet_num = new StringBuffer();
	static List<BasicNameValuePair> formParams1 = new ArrayList<BasicNameValuePair>();
	static HttpGet get = new HttpGet("http://www.game3799.com/lucky28/index");
	static int errorNum = -1;

	public static void tz() throws Exception {
		map.clear();
		String num = "";
		formParams1.clear();
			bet_num.replace(0, bet_num.length(), "");
			RequestConfig requestConfig = RequestConfig.custom()
					.setConnectTimeout(50000).setConnectionRequestTimeout(20000)
					.setSocketTimeout(50000).build();
			get.setConfig(requestConfig);
			String time;
			String time1;
			synchronized(Loading19D.httpClient){
				response = Loading19D.httpClient.execute(get);
				HttpEntity entity = response.getEntity();
				String htmlPage = EntityUtils.toString(entity);
				time = StringUtil.getRegexStr(htmlPage,
						"J_jcTime\" data-lasttime=\"(\\d+)");
				time1 = StringUtil.getRegexStr(htmlPage,
						"J_kjTime\" data-lasttime=\"(\\d+)");
				qihao = StringUtil.getRegexStr(htmlPage, "距离第 <b>(\\d+)");
				num = StringUtil.getRegexStr(htmlPage, "</a>金豆：(.*?)<span ");
				currentNumber = StringUtil.getRegexStr(htmlPage,
						"<span class=\"now-jieguo\">(\\d+)");
                resList.clear();
                List<String> sss = StringUtil.getRegexStrs(htmlPage, "class=\"js-ball b-pc28\">(\\d+)<");
                for(String s:sss){
                    resList.add(Integer.parseInt(s)); 
                }				
				EntityUtils.consume(response.getEntity());
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
			int sleepTime = 0;
			if (WZpojo.isSf_pl()) {
//				sleepTime = Integer.parseInt(time)
//						- (int) (Math.random() * 8 + 18);
				sleepTime = (int) (Math.random() * Integer.parseInt(time)) + 10;
			} else {
				sleepTime = (int) (Math.random() * Integer.parseInt(time)) + 10;
			}
			TZcontrol.TZqihao = qihao;
			TZcontrol.setTime(num, sleepTime + "", time1);
//			setJg();
	}

	public static void postData() throws Exception {
//		HttpPost post1 = new HttpPost("http://www.game3799.com/lucky28/Bet");
//		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(
//				50000).setConnectionRequestTimeout(20000).setSocketTimeout(50000)
//				.build();
//		post1.setConfig(requestConfig);
//
//			post1.setEntity(new UrlEncodedFormEntity(formParams1, "UTF-8"));
//			synchronized(Loading19D.httpClient){
//				response = Loading19D.httpClient.execute(post1);
//				EntityUtils.consume(response.getEntity());
//			}
//				response.getEntity().getContent().close();
	}

	public static void setJg() throws Exception {
		HttpPost post = new HttpPost("http://www.game3799.com/lucky28/BetCurRate");
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(
				50000).setConnectionRequestTimeout(20000).setSocketTimeout(50000)
				.build();
		post.setConfig(requestConfig);
		List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
		formParams.add(new BasicNameValuePair("period_no", qihao));
			post.setEntity(new UrlEncodedFormEntity(formParams, "UTF-8"));
			synchronized(Loading19D.httpClient){
				response = Loading19D.httpClient.execute(post);
				JSONObject obj = JSONObject.parseObject(EntityUtils
						.toString(response.getEntity()));
				String bet_rate[] = obj.getString("bet_rate").split(",");
				for (int i = 0; i <= 27; i++) {
					if (i <= 13)
						map.put(i, Double.valueOf(d[i]
								* Double.parseDouble(bet_rate[i])));
					else {
						map.put(i, Double.valueOf(d[(27 - i)]
								* Double.parseDouble(bet_rate[i])));
					}
				}
				EntityUtils.consume(response.getEntity());
			}
			int tz_js_min = Integer.parseInt(TZcelue.getTZ_js_min());
			int tz_js_max = Integer.parseInt(TZcelue.getTZ_js_max());
			int tz_js_bs = tz_js_max - tz_js_min;
			// *************************************************//
//			TZcontrol.setJg(map, map1, listjg);
			map1.clear();
//			Pdipl.savePl(map, map1);
			GM3.getList(resList, listjg);
//            for(int q:listjg){
//                listjg_1.add(q);
//            }
//            listjg.clear();
//            for(int i=0;i<=27;i++){
//                if(listjg_1.contains(i)){
//                    
//                }else{
//                    listjg.add(i);
//                }
//            }
//            listjg_1.clear();
			// *************************************************//
			Collections.sort(listjg);
			int sum = 0;
//			int betting = (int) (Math.random() * tz_js_bs + tz_js_min);
			int betting = tz_js_min;
			betting = FanBei.getBetting(betting, errorNum);
			for (int ii = 0; ii < listjg.size(); ii++) {
				sum += bet[((Integer) listjg.get(ii)).intValue()];
			}
			int[] betting1 = new int[28];
			int fenshu = betting / sum;
			for (int i = 0; i <= 27; i++) {
				betting1[i] = (bet[i] * fenshu);
				if (listjg.contains(Integer.valueOf(i))) {
					bet_num.append(betting1[i]).append(",");
				} else {
					bet_num.append(0).append(",");
				}
			}
			bet_num.replace(bet_num.length() - 1, bet_num.length(), "");
			int sum1 = 0;
			for (int i = 0; i <= 27; i++) {
				sum1 += betting1[i];
			}
			formParams1.add(new BasicNameValuePair("total", sum1 + ""));
			formParams1.add(new BasicNameValuePair("bet_num", bet_num
					.toString()));
			formParams1.add(new BasicNameValuePair("period_no", qihao));
	}
}