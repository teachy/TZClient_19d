/**
 * 文件名：Gm.java
 * 版权： 成都新秩序网络科技有限公司
 * 描述：〈描述〉
 * 修改时间：2016年12月13日 
 * 修改内容：〈修改内容〉
 */
package com.tu.suanfa.pl;

import java.util.List;

//和1完全一样
public class JG2_1 {

    /**
     * @param args
     */
    static double[] jg = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
        0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };
    static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
        75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
    static int maxcountvalue=600;
    static int jishuqi=0;//防止死循环
    public static void getList(List<Integer> listjg,List<Integer> listjg_2,int currentNumber,List<Integer> resList,boolean haswin) {
        if(haswin){
            maxcountvalue=maxcountvalue-75;
        }else{
            maxcountvalue=maxcountvalue+150;
        }
        if(maxcountvalue>1000){
            maxcountvalue=900;
        }
        if(maxcountvalue<0){
            maxcountvalue=100;
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
                 jishuqi=0;
                 while(true){
                     jishuqi++;
                     if(jishuqi>=2000){
                         break;
                     }
                     tem=tem+0.1;
                     max = currentBFB+tem;
                     min = currentBFB-tem;
                     for(int i=0;i<=27;i++){
                         if(count>=(maxcountvalue/2)){
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
                     if(count>=(maxcountvalue/2)){
                         break;
                     }
                 }
             }else{
                 double currentBFB = currentJg*jg[currentNumber];
                 int count=0;
                 double tem=0;
                 double max = currentBFB;
                 double min = currentBFB;
                 jishuqi=0;
                 while(true){
                     jishuqi++;
                     if(jishuqi>=2000){
                         break;
                     }
                     tem=tem+0.1;
                     max = currentBFB+tem;
                     min = currentBFB-tem;
                     for(int i=0;i<=27;i++){
                         if(count>=(maxcountvalue/2)){
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
                     if(count>=(maxcountvalue/2)){
                         break;
                     }
                 }
             }
             //反向
             if(currentNumber>=14){
                 double currentBFB = currentJg*jg[27-currentNumber];
                 int count=0;
                 double tem=0;
                 int ji=0;
                 double temd =0;
                 jishuqi=0;
                 while(true){
                     jishuqi++;
                     if(jishuqi>=2000){
                         break;
                     }
                     ji=0;
                     temd=0;
                     tem=0;
                     for(int i=0;i<=27;i++){
                         if(count>=(maxcountvalue/2)){
                             break;
                         }
                         if(i<=13){
                             temd = listjg_2.get(i)*jg[i]-currentBFB;
                             if(temd>0){
                                 
                             }else{
                                 temd=temd*-1;
                             } 
                             if(temd>tem){
                                 tem=temd;
                                 ji=i; 
                             }
                         }else{
                             temd = listjg_2.get(i)*jg[27-i]-currentBFB;
                             if(temd>0){
                                 
                             }else{
                                 temd=temd*-1;
                             } 
                             if(temd>tem){
                                 tem=temd;
                                 ji=i; 
                             }
  
                         }
                     }
                     if(listjg.contains(ji)){
                         
                     }else{
                         listjg.add(ji);
                         count=count+bet[ji];  
                     }
                     if(ji>13){
                         listjg_2.set(ji, (int) (currentBFB/jg[27-ji]));
                     }else{
                         listjg_2.set(ji, (int) (currentBFB/jg[ji]));
                     }
                     
                     if(count>=(maxcountvalue/2)){
                         break;
                     }
                 }
             }else{
                 double currentBFB = currentJg*jg[currentNumber];
                 int count=0;
                 double tem=0;
                 int ji=0;
                 double temd =0;
                 jishuqi=0;
                 while(true){
                     jishuqi++;
                     if(jishuqi>=2000){
                         break;
                     }
                     ji=0;
                     temd=0;
                     tem=0;
                     for(int i=0;i<=27;i++){
                         if(count>=(maxcountvalue/2)){
                             break;
                         }
                         if(i<=13){
                             temd = listjg_2.get(i)*jg[i]-currentBFB;
                             if(temd>0){
                                 
                             }else{
                                 temd=temd*-1;
                             } 
                             if(temd>tem){
                                 tem=temd;
                                 ji=i; 
                             }
                         }else{
                             temd = listjg_2.get(i)*jg[27-i]-currentBFB;
                             if(temd>0){
                                 
                             }else{
                                 temd=temd*-1;
                             } 
                             if(temd>tem){
                                 tem=temd;
                                 ji=i; 
                             }
  
                         }
                     }
                    if(listjg.contains(ji)){
                         
                     }else{
                         listjg.add(ji);
                         count=count+bet[ji];  
                     }
                    if(ji>13){
                        listjg_2.set(ji, (int) (currentBFB/jg[27-ji]));
                    }else{
                        listjg_2.set(ji, (int) (currentBFB/jg[ji]));
                    }
                     if(count>=(maxcountvalue/2)){
                         break;
                     }
                 }
             }
         }
         
    }
    
}