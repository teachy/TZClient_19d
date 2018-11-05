package com.tu.celue;

public class CelueControl {
   public static boolean checks(){
	   if(Times.getCheckTime()&&Quanjue.checkqj()&&Gold.checkGold()){
		   return true;
	   }else{
		   return false;
	   }
   }
}
