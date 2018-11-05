package com.tu.TZ.XM;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tu.TZ.TZcontrol;
import com.tu.celue.FanBei;
import com.tu.loadWz.D19.Loading19D;
import com.tu.loadWz.XM.loadingXM;
import com.tu.pojo.TZcelue;
import com.tu.pojo.WZpojo;
import com.tu.util.Checks;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
public class XM_tz {
	static HttpResponse response = null;
	static double[] d = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
			0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };
	static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
			75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
	static String qihao = "";
	static String currentNumber = "";
	static Map<Integer, Double> map = new HashMap<Integer, Double>();
	static Map<Integer, Double> map1 = new HashMap<Integer, Double>();
	static List<Integer> listjg = new ArrayList<Integer>();
	static StringBuffer bet_num = new StringBuffer();
	static List<BasicNameValuePair> formParams1 = new ArrayList<BasicNameValuePair>();
	static HttpGet get = new HttpGet("http://www2.newdream68.com/portal?method=play28");
	static HttpPost post1 = new HttpPost(
	"http://www2.newdream68.com/gameServlet");
	static int errorNum=-1;
	@SuppressWarnings("deprecation")
	public static void tz(){
				map.clear();
				String num="";
				formParams1.clear();
			try {
				bet_num.replace(0, bet_num.length(), "");
                response=loadingXM.httpClient.execute(get);
                String yzm=EntityUtils.toString(response.getEntity());
                EntityUtils.consume(response.getEntity());
                num=yzm.split("#balanceMoney")[1].substring(9, 25).split("'")[0].trim().replaceAll(",", "");
                EntityUtils.consume(response.getEntity());
        		List<NameValuePair> formParams = new ArrayList<NameValuePair>();
        		formParams.add(new BasicNameValuePair("method", "gameList"));
        		formParams.add(new BasicNameValuePair("gameid", "6"));
        		formParams.add(new BasicNameValuePair("pageNumber", "1"));
        		post1.setEntity(new UrlEncodedFormEntity(formParams, HTTP.UTF_8));
        		response = loadingXM.httpClient.execute(post1);
        		String ss = EntityUtils.toString(response.getEntity());
        		JSONObject obj = JSONObject.parseObject(ss);
        		JSONArray a = obj.getJSONArray("dataTop4");
        		JSONArray b = obj.getJSONArray("hisDatas");
        		JSONObject s = a.getJSONObject(0);
        		qihao = s.getString("qiid");
        		String time1 = s.getString("remain_time");
        		String time = s.getString("timeR");
				currentNumber =b.getJSONObject(0).getString("jieguo"); 
				EntityUtils.consume(response.getEntity());
				if(listjg.contains(Integer.parseInt(currentNumber))){
					errorNum=0;
				}else{
					errorNum++;
				}
				if(errorNum>=11){
					errorNum=0;
				}
				listjg.clear();
				int sleepTime=0;
				if(WZpojo.isSf_pl()){
					sleepTime =  Integer.parseInt(time)- (int) (Math.random() * 8 + 8);
				}else{
					sleepTime = (int) (Math.random()* Integer.parseInt(time)) + 10;
				}
				TZcontrol.TZqihao=qihao;
				TZcontrol.setTime(num, sleepTime+"", time1);
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (Exception e2){
				e2.printStackTrace();
			}
	}
	public static void postData(){
		setJg();
		HttpPost post1 = new HttpPost(
				"http://www2.newdream68.com/gamexy28?method=addGameTou");
		try {
			post1.setEntity(new UrlEncodedFormEntity(formParams1, "UTF-8"));
			if (Checks.getCheckTime()) {
				try {
					response = Loading19D.httpClient.execute(post1);
					EntityUtils.consume(response.getEntity());
				} catch (ClientProtocolException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						response.getEntity().getContent().close();
					} catch (UnsupportedOperationException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
	
	public static void setJg(){
			int tz_js_min=Integer.parseInt(TZcelue.getTZ_js_min());
			int tz_js_max=Integer.parseInt(TZcelue.getTZ_js_max());
			int tz_js_bs=tz_js_max-tz_js_min;
			//*************************************************//
			TZcontrol.setJg(map, map1, listjg,currentNumber);
			//*************************************************//
			Collections.sort(listjg);
			int sum = 0;
			int betting = (int) (Math.random() * tz_js_bs + tz_js_min);
			betting = FanBei.getBetting(betting, errorNum);
			for (int ii = 0; ii < listjg.size(); ii++) {
				sum += bet[((Integer) listjg.get(ii)).intValue()];
			}
			int[] betting1 = new int[28];
			int fenshu = betting / sum;
			for (int i = 0; i <= 27; i++) {
				if (listjg.contains(Integer.valueOf(i))) {
					betting1[i] = (bet[i] * fenshu);
				}
			}
			for (int i = 0; i < listjg.size(); i++) {
				if (listjg.get(i) > 0) {
					formParams1.add(new BasicNameValuePair("tbChk[" + listjg.get(i)
							+ "]", "on"));
				}
			}
			for (int i = 0; i <= 27; i++) {
				formParams1.add(new BasicNameValuePair("tbNum" + i + "", ""
						+ betting1[i] + ""));
			}
			formParams1.add(new BasicNameValuePair("gg", "6"));
			formParams1.add(new BasicNameValuePair("qiid", qihao));
			formParams1.add(new BasicNameValuePair("selectmodel", ""));
			formParams1.add(new BasicNameValuePair("submit", "确定投注"));
			formParams1.add(new BasicNameValuePair("tbTotalG2", sum+""));
			formParams1.add(new BasicNameValuePair("tmoney", sum+""));
			formParams1.add(new BasicNameValuePair("tzid", "1"));
	}
}