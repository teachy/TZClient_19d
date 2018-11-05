package com.tu.celue;

import com.tu.pojo.TZcelue;

public class FanBei {
	/**
	 * 
	* @Title: getBetting 
	* @Description: 翻倍策略 
	* @param @param betting
	* @param @param times
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws
	 */
     public static int getBetting(int betting,int times){
    	 int bet = betting;
    	 double fanbei1=Double.parseDouble(TZcelue.getTZ_cs_1());
    	 double fanbei2=Double.parseDouble(TZcelue.getTZ_cs_2());
    	 double fanbei3=Double.parseDouble(TZcelue.getTZ_cs_3());
    	 double fanbei4=Double.parseDouble(TZcelue.getTZ_cs_4());
    	 double fanbei5=Double.parseDouble(TZcelue.getTZ_cs_5());
    	 double fanbei6=Double.parseDouble(TZcelue.getTZ_cs_6());
    	 double fanbei7=Double.parseDouble(TZcelue.getTZ_cs_7());
    	 double fanbei8=Double.parseDouble(TZcelue.getTZ_cs_8());
    	 double fanbei9=Double.parseDouble(TZcelue.getTZ_cs_9());
    	 double fanbei10=Double.parseDouble(TZcelue.getTZ_cs_10());
    	 if(times==1){
    		 return (int) (bet*fanbei1);
    	 }else if(times==2){
    		 return (int) (bet*fanbei1*fanbei2);
    	 }else if(times==3){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3);
    	 }else if(times==4){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4);
    	 }else if(times==5){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5);
    	 }else if(times==6){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5*fanbei6);
    	 }else if(times==7){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5*fanbei6*fanbei7);
    	 }else if(times==8){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5*fanbei6*fanbei7*fanbei8);
    	 }else if(times==9){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5*fanbei6*fanbei7*fanbei8*fanbei9);
    	 }else if(times==10){
    		 return (int) (bet*fanbei1*fanbei2*fanbei3*fanbei4*fanbei5*fanbei6*fanbei7*fanbei8*fanbei8*fanbei10);
    	 }else{
    		 return bet;
    	 }
     }
}
