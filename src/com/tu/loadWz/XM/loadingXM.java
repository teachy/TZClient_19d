package com.tu.loadWz.XM;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.tu.pojo.WZpojo;
import com.tu.util.StringUtil;
@SuppressWarnings("deprecation")
public class loadingXM {
	public static HttpClient httpClient = new DefaultHttpClient();
	static HttpResponse response = null;
	static 	HttpGet httpget = new HttpGet(
			"http://www2.newdream68.com/jsp/image.jsp?ran="
			+ Math.random() + "");
	public static void Load() throws Exception {
	       httpClient.getParams().setParameter("http.connection.timeout", Integer.valueOf(10000));
	       httpClient.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));
		HttpPost post = new HttpPost(
				"http://www2.newdream68.com/UserLogin?method=login");
		List<NameValuePair> formParams = new ArrayList<NameValuePair>();
		formParams.add(new BasicNameValuePair("x", "42"));
		formParams.add(new BasicNameValuePair("y", "16"));
		formParams.add(new BasicNameValuePair("chkcode", WZpojo.getWz_code()));
		formParams.add(new BasicNameValuePair("password", WZpojo.getWz_pass()));
		formParams.add(new BasicNameValuePair("refererUrl",
				"http://www.newdream68.com/login.php"));
		formParams.add(new BasicNameValuePair("u_001", WZpojo.getWz_name()));
		post.setEntity(new UrlEncodedFormEntity(formParams, HTTP.UTF_8));
		response = httpClient.execute(post);
		EntityUtils.consume(response.getEntity());
		Header h =response.getFirstHeader("Location");
		String reurl= StringUtil.getRegexStr(h.getValue().toString(), "(http:.*token=\\d+)");
		HttpGet ge1 = new HttpGet(reurl);
		ge1.setHeader("Host","www.newdream68.com");
		response = httpClient.execute(ge1);
		EntityUtils.consume(response.getEntity());
		new Thread(new Runnable() {
			public void run() {
				HttpGet get = new HttpGet("http://www.newdream68.com/menber/index.php");
				String s = "";
				String id = "";
				String num = "";
				while (true) {
					try {
						response = httpClient.execute(get);
						HttpEntity entity = response.getEntity();
						s = EntityUtils.toString(entity);
						id = StringUtil.getRegexStr(s,"欢迎您：(\\d+)");
						num = StringUtil.getRegexStr(s,"<td width=\"56%\">(.*?)元");
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
		File file = new File("C.bmp");
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
