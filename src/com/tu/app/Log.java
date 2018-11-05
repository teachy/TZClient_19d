package com.tu.app;

import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static void initLog4j() {
		String path = System.getProperty("user.dir")+"/properties/log4j.properties";
		 PropertyConfigurator.configure (path);
	}
}
