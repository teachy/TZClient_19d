package com.tu.TZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tu.TZ.BT.BT_tz;
import com.tu.TZ.D19.D19_tz;
import com.tu.TZ.XM.XM_tz;
import com.tu.netty.DealMsg;
import com.tu.pojo.WZpojo;
import com.tu.suanfa.pl.Dipl;
import com.tu.suanfa.pl.Gaopl;
import com.tu.suanfa.pl.Pdipl;
import com.tu.suanfa.pl.Pgaopl;
import com.tu.suanfa.pl.Zhongpl;

public class TZcontrol {
	public static List<Integer> listjgs = new ArrayList<Integer>();
	public static List<Integer> listjgs1 = new ArrayList<Integer>();
	public static List<Integer> listjgs2 = new ArrayList<Integer>();
	public static String TZqihao;
	public static int biaoshi=1;
	public static int biaoshi1=1;
	public static boolean first=true;
	public static void beforeTz(){
		if(WZpojo.getWz_index().equals("1")){
//			D19_tz.tz();
		}else if(WZpojo.getWz_index().equals("2")){
			XM_tz.tz();
		}else if(WZpojo.getWz_index().equals("3")){
			BT_tz.tz();
		}else if(WZpojo.getWz_index().equals("4")){
			
		}else if(WZpojo.getWz_index().equals("5")){
			
		}
	}
	
	public static void postData(){
		if(WZpojo.getWz_index().equals("1")){
//			D19_tz.postData();
		}else if(WZpojo.getWz_index().equals("2")){
			XM_tz.postData();
		}else if(WZpojo.getWz_index().equals("3")){
			if(WZpojo.getWz_tz_index().equals("1")){
				BT_tz.postData();
			}else if(WZpojo.getWz_tz_index().equals("2")){
				
			}
		}else if(WZpojo.getWz_index().equals("4")){
	
		}else if(WZpojo.getWz_index().equals("5")){
			
		}
	}
	
	/**
	 * 
	* @Title: setTime 
	* @Description: 倒计时和金币 
	* @param @param gold
	* @param @param tzTime
	* @param @param kjTime    设定文件 
	* @return void    返回类型 
	* @throws
	 */
    public static void setTime(String gold,String tzTime,String kjTime){
    	WZpojo.setWz_gold(gold);
    	WZpojo.setTime_tz(tzTime);
    	WZpojo.setTime_kj(kjTime);
    }
    
    /**
     * 
    * @Title: setJg 
    * @Description: 设置结果
    * @param @param map
    * @param @param map1
    * @param @param listjg    设定文件 
    * @return void    返回类型 
    * @throws
     */
    public static void setJg(Map<Integer, Double> map,Map<Integer, Double> map1,List<Integer> listjg,String currentNumber){
		if(WZpojo.isSf_pl()){
			if(WZpojo.getWz_sf_index().equals("1")){
				//低赔率
				Dipl.getNumbers(map, listjg);
			}else if(WZpojo.getWz_sf_index().equals("2")){
				//高赔率
				Gaopl.getNumbers(map, listjg);
			}else if(WZpojo.getWz_sf_index().equals("6")){
				//中间赔率
				Zhongpl.getNumbers(map, listjg);
			}else if(WZpojo.getWz_sf_index().equals("4")){
				//比上期赔率高的
				if(map1.isEmpty()){
				   for (int i = 0; i <= 27; i++) {
					   listjg.add(i);
				    }
				}else{
					Pgaopl.getNumbers(map, listjg, map1);	
				}
				Pgaopl.savePl(map, map1);
			}else if(WZpojo.getWz_sf_index().equals("5")){
				//比上期赔率低的
				if(map1.isEmpty()){
				   for (int i = 0; i <= 27; i++) {
					   listjg.add(i);
				    }
				}else{
					Pdipl.getNumbers(map, listjg, map1);	
				}
			}else if(WZpojo.getWz_sf_index().equals("3")){
				//tes
				System.out.println("当前开奖："+currentNumber);
				if(map1.isEmpty()){
				   Gaopl.getNumbers(map, listjgs2);
				}else{
					if(listjgs1.contains(Integer.parseInt(currentNumber))||first){
						listjgs1.clear();
						if(biaoshi==1){
							Pdipl.getNumbers(map, listjgs1, map1);	
							biaoshi=1;
						}else{
							Pgaopl.getNumbers(map, listjgs1, map1);
							biaoshi=2;
						}
					}else{
						listjgs1.clear();
						if(biaoshi==1){
							Pgaopl.getNumbers(map, listjgs1, map1);
							biaoshi=2;
						}else{
							Pdipl.getNumbers(map, listjgs1, map1);	
							biaoshi=1;
						}
					}
					if(listjgs2.contains(Integer.parseInt(currentNumber))){
						listjgs2.clear();
						if(biaoshi1==1){
							Gaopl.getNumbers(map, listjgs2);	
							biaoshi1=1;
						}else{
							Dipl.getNumbers(map, listjgs2);
							biaoshi1=2;
						}
					}else{
						listjgs2.clear();
						if(biaoshi1==1){
							Dipl.getNumbers(map, listjgs2);
							biaoshi1=2;
						}else{
							Gaopl.getNumbers(map, listjgs2);
							biaoshi1=1;
						}
					}
					first=false;
				}
				aa(listjg);
				System.out.println(listjg);
			}
		}else{
			if(WZpojo.getWz_sf_index().equals("1")){
				DealMsg.selectJg("1", listjg);
			}else if(WZpojo.getWz_sf_index().equals("2")){
				DealMsg.selectJg("2", listjg);
			}else if(WZpojo.getWz_sf_index().equals("3")){
				DealMsg.selectJg("3", listjg);
			}else if(WZpojo.getWz_sf_index().equals("4")){
				DealMsg.selectJg("4", listjg);
			}
		}
		listjgs = listjg;
    }
    
    public static  void aa(List<Integer> listjg){
    	for(int i:listjgs1){
    		listjg.add(i);
    	}
    	for(int i:listjgs2){
    		if(!listjg.contains(i)){
    			listjg.add(i);
    		}
    	}
    }
}
