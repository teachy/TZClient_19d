package com.tu.loadWz.D19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.tu.pojo.WZpojo;
import com.tu.util.StringUtil;


@SuppressWarnings("deprecation")
public class Loading19D {
	
	public static HttpClient httpClient = null;
	static HttpResponse response = null;
	static HttpGet httpget = new HttpGet("http://www.game3799.com/Common/VCode?"+Math.random()*1000);
    private static PoolingHttpClientConnectionManager connectionManager;
	static {
	        Registry<ConnectionSocketFactory> reg = RegistryBuilder.<ConnectionSocketFactory>create()
	                .register("http", PlainConnectionSocketFactory.INSTANCE)
	                .register("https", SSLConnectionSocketFactory.getSocketFactory())
	                .build();
	        connectionManager = new PoolingHttpClientConnectionManager(reg);
	        connectionManager.setMaxTotal(400);
	        connectionManager.setDefaultMaxPerRoute(100);
	        httpClient = HttpClientBuilder.create().setConnectionManager(connectionManager).build();
	    }
	public static void Load() throws IOException{
		RequestConfig requestConfig = RequestConfig.custom()  
        .setConnectTimeout(5000).setConnectionRequestTimeout(2000)  
        .setSocketTimeout(5000).build();  
		httpget.setConfig(requestConfig);  
	        HttpPost post = new HttpPost("http://www.game3799.com/Account/HomeLogon");
	        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
	        formParams.add(new BasicNameValuePair("UserName", WZpojo.getWz_name()));
	        formParams.add(new BasicNameValuePair("Password", WZpojo.getWz_pass()));
	        formParams.add(new BasicNameValuePair("VCode", WZpojo.getWz_code()));
	        post.setEntity(new UrlEncodedFormEntity(formParams, "utf-8"));
	        post.addHeader("Origin", "http://www.game3799.com");
	        post.addHeader("Referer", "http://www.game3799.com/");
	        response = httpClient.execute(post);
	        EntityUtils.consume(response.getEntity());
			new Thread(new Runnable() {
				public void run() {
					HttpGet get = new HttpGet("http://www.game3799.com/");
					RequestConfig requestConfig = RequestConfig.custom()  
			        .setConnectTimeout(5000).setConnectionRequestTimeout(2000)  
			        .setSocketTimeout(5000).build();  
					get.setConfig(requestConfig);  
					String s = "";
					String id = "";
					String num = "";
					while (true) {
						try {
							response = httpClient.execute(get);
							HttpEntity entity = response.getEntity();
							s = EntityUtils.toString(entity);
							id = StringUtil.getRegexStr(s,"ID：(\\d+)");
							num = StringUtil.getRegexStr(s,"</a>金豆：(.*?)<span ");
							EntityUtils.consume(response.getEntity());
							WZpojo.setWz_id(id);
							WZpojo.setWz_gold(num);
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
	
	public static void main(String[] args) {
		System.out.println(9250+2147483647);
	}
}
