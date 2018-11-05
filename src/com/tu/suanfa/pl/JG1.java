/**
 * 文件名：Gm.java
 * 版权： 成都新秩序网络科技有限公司
 * 描述：〈描述〉
 * 修改时间：2016年12月13日 
 * 修改内容：〈修改内容〉
 */
package com.tu.suanfa.pl;

import java.util.List;


public class JG1 {

    /**
     * @param args
     */
    static double[] jg = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
        0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };
    static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
        75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
    static int maxcountvalue=800;
    public static int crruentCount=0;
    public static void getList(List<Integer> listjg,List<Integer> listjg_2,int currentNumber,List<Integer> resList,boolean haswin) {
        if(haswin){
            maxcountvalue=maxcountvalue-100;
        }else{
            maxcountvalue=maxcountvalue+110;
        } 
        if(maxcountvalue<=100){
            maxcountvalue=300;
        }
        if(listjg_2.size()==0){
             for(int i=0;i<=27;i++){
                 listjg.add(i);
             }
         }else{
             int currentJg = listjg_2.get(currentNumber);
             if(currentNumber>=14){
                 double currentBFB = currentJg*jg[27-currentNumber];
                 int count=0;
                 double tem=0;
                 double max = currentBFB;
                 double min = currentBFB;
                 while(true){
                     tem=tem+0.1;
                     max = currentBFB+tem;
                     min = currentBFB-tem;
                     for(int i=0;i<=27;i++){
                         if(count>=maxcountvalue){
                             crruentCount=count;
                             break;
                         }
                         if(i<=13){
                             if(min<=listjg_2.get(i)*jg[i]&&max>=listjg_2.get(i)*jg[i]){
                                 if(listjg.contains(i)){
                                     
                                 }else{
                                     listjg.add(i);
                                     count=count+bet[i];  
                                 }
                    
                             }
                         }else{
                             if(min<=listjg_2.get(i)*jg[27-i]&&max>=listjg_2.get(i)*jg[27-i]){
                                 if(listjg.contains(i)){
                                     
                                 }else{
                                     listjg.add(i);
                                     count=count+bet[i];  
                                 }
                             }
                         }
                     }
                     if(count>=maxcountvalue){
                         crruentCount=count;
                         break;
                     }
                 }
             }else{
                 double currentBFB = currentJg*jg[currentNumber];
                 int count=0;
                 double tem=0;
                 double max = currentBFB;
                 double min = currentBFB;
                 while(true){
                     tem=tem+0.1;
                     max = currentBFB+tem;
                     min = currentBFB-tem;
                     for(int i=0;i<=27;i++){
                         if(count>=maxcountvalue){
                             crruentCount=count;
                             break;
                         }
                         if(i<=13){
                             if(min<=listjg_2.get(i)*jg[i]&&max>=listjg_2.get(i)*jg[i]){
                                 if(listjg.contains(i)){
                                     
                                 }else{
                                     listjg.add(i);
                                     count=count+bet[i];  
                                 }
                    
                             }
                         }else{
                             if(min<=listjg_2.get(i)*jg[27-i]&&max>=listjg_2.get(i)*jg[27-i]){
                                 if(listjg.contains(i)){
                                     
                                 }else{
                                     listjg.add(i);
                                     count=count+bet[i];  
                                 }
                             }
                         }
                     }
                     if(count>=maxcountvalue){
                         crruentCount=count;
                         break;
                     }
                 }
             }
         }
         
    }
    
}