package com.tu.util;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JaveScriptEngine {
	public static String getDBE(String str) {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine se = sem.getEngineByExtension("js");
		try {se.eval(new FileReader(System.getProperty("user.dir")
							+ "/properties/t.js"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		Invocable jsInvoke = (Invocable) se;
		Object s = null;
		try {
			s = jsInvoke.invokeFunction("bde", str);
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return (String) s;
	}
}
