package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.List;

public class TT {
	static List<Integer> listjg = new ArrayList<Integer>();
	static List<Integer> listjg_1 = new ArrayList<Integer>();
  public static void main(String[] args) {
	  listjg.add(12);
	  listjg.add(11);
		for(int q:listjg){
			listjg_1.add(q);
		}
	  listjg.clear();
	  System.out.println(listjg_1+"11111111111");
 }
}
