package com.tu.celue;

import com.tu.pojo.TZcelue;

public class Quanjue {
   public static boolean checkqj(){
	   if(TZcelue.getTZ_qj().isEmpty()){
		   return true;
	   }else{
		   int qj = Integer.parseInt(TZcelue.getTZ_qj());
		   int i = (int) (Math.random()*qj);
		   if(i==1){
			   return false;
		   }else{
			   return true;
		   }
	   }
   }
}
