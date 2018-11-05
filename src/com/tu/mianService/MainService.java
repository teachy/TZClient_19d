package com.tu.mianService;

import com.tu.app.Log;
import com.tu.client.LoginClient;

public class MainService {
  public static void main(String[] args) {
	  Log.initLog4j();
	  LoginClient.main(null);
  }
}
