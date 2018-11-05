/**
 * 文件名：Gm.java
 * 版权： 成都新秩序网络科技有限公司
 * 描述：〈描述〉
 * 修改时间：2016年12月13日 
 * 修改内容：〈修改内容〉
 */
package com.tu.suanfa.pl;

import java.util.List;


public class JG {

    /**
     * @param args
     */
    static double[] jg = { 0.001, 0.003, 0.006, 0.01, 0.015, 0.021, 0.028,
        0.036, 0.045, 0.055, 0.063, 0.069, 0.073, 0.075 };

    public static void getList(List<Integer> listjg,List<Integer> listjg_2,int currentNumber,List<Integer> resList) {
         if(listjg_2.size()==0){
             for(int i=0;i<=27;i++){
                 listjg.add(i);
             }
         }else{
             int currentJg = listjg_2.get(currentNumber);
             if(currentNumber>=14){
                 double currentBFB = currentJg*jg[27-currentNumber];
                 double max = currentBFB+0.1;
                 double min = currentBFB-0.1;
                 for(int i=0;i<=27;i++){
                     if(i<=13){
                         if(min<=listjg_2.get(i)*jg[i]&&max>=listjg_2.get(i)*jg[i]){
                             listjg.add(i);
                         }
                     }else{
                         if(min<=listjg_2.get(i)*jg[27-i]&&max>=listjg_2.get(i)*jg[27-i]){
                             listjg.add(i);
                         }
                     }
                 }
             }else{
                 double currentBFB = currentJg*jg[currentNumber];
                 double max = currentBFB+0.1;
                 double min = currentBFB-0.1;
                 for(int i=0;i<=27;i++){
                     if(i<=13){
                         if(min<=listjg_2.get(i)*jg[i]&&max>=listjg_2.get(i)*jg[i]){
                             listjg.add(i);
                         }
                     }else{
                         if(min<=listjg_2.get(i)*jg[27-i]&&max>=listjg_2.get(i)*jg[27-i]){
                             listjg.add(i);
                         }
                     }
                 }
             }
            
         }
        
    }
    
}