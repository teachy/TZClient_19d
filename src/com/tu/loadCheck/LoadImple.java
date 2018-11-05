package com.tu.loadCheck;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.tu.loadWz.BT.LoadingBT;
import com.tu.loadWz.D19.Loading19D;
import com.tu.loadWz.XM.loadingXM;
import com.tu.netty.ClientHandler;
import com.tu.netty.NettyClient;
import com.tu.pojo.WZpojo;

public class LoadImple {
	private static Log log = LogFactory.getLog(LoadImple.class);

	/**
	 * 
	 * @Title: checkPT
	 * @Description: 连接server
	 * @param @param username
	 * @param @param password
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public static String checkPT(final String username, final String password) {
		new Thread(new Runnable() {
			public void run() {
				try {
					NettyClient.loadServer(username, password);
				} catch (Exception e) {
					log.error("验证失败……" + e.getMessage());
					e.printStackTrace();
				}
			}
		}).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ClientHandler.checkResult;
	}

	/**
	 * 
	 * @Title: checkWZ
	 * @Description: 连接web
	 * @param @param username
	 * @param @param password
	 * @param @param type
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public static String checkWZ(final String username, final String password,
			final String type) {
//		if (ClientHandler.checkResult.equals("1")) {
			try {
				switch (Integer.parseInt(type)) {
				case 0:
					break;
				case 1:
					Loading19D.Load();
					break;
				case 2:
					loadingXM.Load();
					break;
				case 3:
					LoadingBT.Load();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				}
			} catch (Exception e) {
				log.error("登录验证失败……" + e.getMessage());
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
			       if(WZpojo.getWz_id().isEmpty()||WZpojo.getWz_gold().isEmpty()){
		            	return "0";
		            }else{
		            	return "1";
		            }
			} catch (Exception e) {
				return "0";
			}
     
//		} else {
//			return "0";
//		}

	}
}
