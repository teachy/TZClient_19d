package com.tu.loadWz.BT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.tu.pojo.WZpojo;
import com.tu.util.Checks;
import com.tu.util.StringUtil;

@SuppressWarnings("deprecation")
public class LoadingBT {
    final static String baseUrl ="42.96.209.98:44719";
	public static HttpClient httpClient = new DefaultHttpClient();
	private static Log log = LogFactory.getLog(LoadingBT.class);
	static HttpResponse response = null;
	static HttpGet httpget = new HttpGet("http://"+baseUrl+"/plugins/vcode/vcode02.php?");
	public static void Load() throws IOException {
		RequestConfig requestConfig = RequestConfig.custom()  
        .setConnectTimeout(5000).setConnectionRequestTimeout(2000)  
        .setSocketTimeout(5000).build();  
		httpget.setConfig(requestConfig);  
		httpClient.getParams().setParameter("http.connection.timeout",
				Integer.valueOf(10000));
		httpClient.getParams().setParameter("http.socket.timeout",
				Integer.valueOf(10000));
		log.info("开始登陆……");
		HttpPost post = new HttpPost(
				"http://"+baseUrl+"/login.php?act=login");
		post.setConfig(requestConfig);  
		List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
		formParams.add(new BasicNameValuePair("tbUserAccount", WZpojo
				.getWz_name()));
		formParams
				.add(new BasicNameValuePair("tbUserPwd", WZpojo.getWz_pass()));
		formParams
				.add(new BasicNameValuePair("tbSafeCode", WZpojo.getWz_code()));
		post.setEntity(new UrlEncodedFormEntity(formParams, "gb2312"));
		post.addHeader("Origin", "http://"+baseUrl+"");
		post.addHeader("Referer", "http://"+baseUrl+"/index.php");
		post
				.addHeader(
						"User-Agent",
						"Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.146 BIDUBrowser/6.x Safari/537.36");
		response = httpClient.execute(post);
		EntityUtils.consume(response.getEntity());
		log.info("登陆完成……");
		new Thread(new Runnable() {
			public void run() {
				RequestConfig requestConfig = RequestConfig.custom()  
		        .setConnectTimeout(5000).setConnectionRequestTimeout(2000)  
		        .setSocketTimeout(5000).build(); 
				HttpGet get = new HttpGet(
						"http://"+baseUrl+"/useraccount.php");
				get.setConfig(requestConfig);  
				InputStream instreams = null;
				String s = "";
				String id = "";
				String num = "";
				while (true) {
					try {
						response = httpClient.execute(get);
						instreams = response.getEntity().getContent();
						s = Checks.convertStreamToString(instreams);
						id = StringUtil.getRegexStr(s,
								"<td width=\"200\"><b class=\"red\">(\\d{6})");
						log.info("id:" + id);
						num = (String) StringUtil.getRegexStrs(s,
								"<td><b class=\"red\">(.*)</b></td>").get(2);
						log.info("吧豆：" + num);
						EntityUtils.consume(response.getEntity());
						WZpojo.setWz_id(id);
						WZpojo.setWz_gold(num);
						instreams.close();
					} catch (UnsupportedOperationException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						Thread.sleep(600000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public static void getImg() {
		try {
			response = httpClient.execute(httpget);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file = new File("C.png");
		if(file.exists()){
			file.delete();
		}
		OutputStream ops = null;
		try {
			ops = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			response.getEntity().writeTo(ops);
			ops.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
