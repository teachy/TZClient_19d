package com.tu.netty;

import java.util.List;
import java.util.Map;

public class DealMsg {
  public static void selectJg(String index,List<Integer> listjg){
	  int js=0;
	  while(NettyClient.resultList.size()==0){
		  try {
			Thread.sleep(1000);
			js++;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(js>=10){
			break;
		}
	  }
	  for(int i=0;i<NettyClient.resultList.size();i++){
		  Map<String,String> map = NettyClient.resultList.get(i);
		  if(map.get("s_id").equals(index)){
			 String jgs[] = map.get("jg").replaceAll("\\[", "").replaceAll("\\]", "").split(",");
			 for(int j=0;j<jgs.length;j++){
				 listjg.add(Integer.parseInt(jgs[j].trim()));
			 }
		  }
	  }
  }
}
