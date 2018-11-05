/**
 * 文件名：Gm.java
 * 版权： 成都新秩序网络科技有限公司
 * 描述：〈描述〉
 * 修改时间：2016年12月13日 
 * 修改内容：〈修改内容〉
 */
package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GM1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double []arr={1,1,1,1,2,2,1,2,1};
        List<Integer> resList = new ArrayList<Integer>();
        resList.add(1);
        resList.add(2);
        resList.add(3);
        resList.add(14);
        getList(resList,null);
        System.out.println(gm(arr,2));
    }

    public static void getList(List<Integer> resList,List<Integer> listjg) {
           
            int temp = resList.get(0)>=14?2:1;
            
            int temp1 = resList.get(0)%2==0?2:1;
            
            double arr[] = new double[resList.size()-1];
            for(int j=1;j<resList.size();j++){
                if(resList.get(j)>=14){
                    arr[arr.length-j]=2; 
                }else{
                    arr[arr.length-j]=1;  
                }
            }
            
            if(gm(arr,temp)>1.5){
                for(int i=14;i<=27;i++){
                    listjg.add(i);
                }
            }else{
                for(int i=0;i<=13;i++){
                    listjg.add(i);
                }
            }
            
            
            double arr1[] = new double[resList.size()-1];
            for(int j=1;j<resList.size();j++){
                if(resList.get(j)%2==0){
                    arr1[arr.length-j]=2; 
                }else{
                    arr1[arr.length-j]=1;  
                }
            }
            
            if(gm(arr1,temp1)>1.5){
                for(int i=0;i<=27;i++){
                    if(i%2==0){
                        listjg.add(i); 
                    }
                }
            }else{
                for(int i=0;i<=27;i++){
                    if(i%2!=0){
                        listjg.add(i); 
                    }
                }
            }
    }
    
    public static double gm(double[] fs, int T) {

        // 预测模型函数
        int size = fs.length;
        int tsize = fs.length - 1;
        double[] arr = fs;// 原始数组
        double[] arr1 = new double[size];// 经过一次累加数组
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
            arr1[i] = sum;
        }
        double[] arr2 = new double[tsize];// arr1的紧邻均值数组
        for (int i = 0; i < tsize; i++) {
            arr2[i] = (double) (arr1[i] + arr1[i + 1]) / 2;
        }
        /*
         * 
         * 下面建立 向量B和YN求解待估参数向量， 即求参数a,b
         */
        /*
         * 下面建立向量B, B是5行2列的矩阵， 相当于一个二维数组。
         */
        double[][] B = new double[tsize][2];
        for (int i = 0; i < tsize; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 1)
                    B[i][j] = 1;
                else
                    B[i][j] = -arr2[i];
            }

        }
        /*
         * 下面建立向量YN
         */
        double[][] YN = new double[tsize][1];
        for (int i = 0; i < tsize; i++) {
            for (int j = 0; j < 1; j++) {
                YN[i][j] = arr[i + 1];
            }
        }

        /*
         * B的转置矩阵BT,2行5列的矩阵
         */
        double[][] BT = new double[2][tsize];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < tsize; j++) {
                BT[i][j] = B[j][i];
            }
        }
        /*
         * 将BT和B的乘积所得到的结果记为数组B2T,则B2T是一个2*2的矩阵
         */
        double[][] B2T = new double[2][2];
        for (int i = 0; i < 2; i++) {// rows of BT

            {
                for (int j = 0; j < 2; j++)// cloums of B
                {
                    for (int k = 0; k < tsize; k++)// cloums of BT=rows of B
                    {
                        B2T[i][j] = B2T[i][j] + BT[i][k] * B[k][j];
                    }
                }

            }
        }
        /* 下面求B2T的逆矩阵，设为B_2T，怎么适用于一般的矩阵？ */
        double[][] B_2T = new double[2][2];
        B_2T[0][0] = (1 / (B2T[0][0] * B2T[1][1] - B2T[0][1] * B2T[1][0]))
                * B2T[1][1];
        B_2T[0][1] = (1 / (B2T[0][0] * B2T[1][1] - B2T[0][1] * B2T[1][0]))
                * (-B2T[0][1]);
        B_2T[1][0] = (1 / (B2T[0][0] * B2T[1][1] - B2T[0][1] * B2T[1][0]))
                * (-B2T[1][0]);
        B_2T[1][1] = (1 / (B2T[0][0] * B2T[1][1] - B2T[0][1] * B2T[1][0]))
                * B2T[0][0];
        /*
         * 根据以上所求的各已知量下面求待估参数的未知量a和b，待估向量矩阵等于B_2T*BT*YN
         * 下面我们分别求这些矩阵的乘积，首先求B_2T*BT，令B_2T*BT的乘积为A矩阵，则A就是一个2*5的矩阵
         */
        /*
         * 
         * 
         * 
         * 下面先求A矩阵
         */
        double[][] A = new double[2][tsize];
        for (int i = 0; i < 2; i++) {// rows of B_2T
            {
                for (int j = 0; j < tsize; j++)// cloums of BT
                {
                    for (int k = 0; k < 2; k++)// cloums of B_2T=rows of BT
                    {
                        A[i][j] = A[i][j] + B_2T[i][k] * BT[k][j];
                    }
                }

            }
        }
        /*
         * 
         * 
         * 下面求A和YN矩阵的乘积，令乘积为C矩阵，则C就是一个2*1的矩阵
         */
        double[][] C = new double[2][1];
        for (int i = 0; i < 2; i++) {// rows of A

            {
                for (int j = 0; j < 1; j++)// cloums of YN
                {
                    for (int k = 0; k < tsize; k++)// cloums of A=rows of YN
                    {
                        C[i][j] = C[i][j] + A[i][k] * YN[k][j];
                    }
                }

            }
        }
        /* 根据以上所得则a=C[0][0],b=C[1][0]; */
        double a = C[0][0], b = C[1][0];
        int i = T;// 读取一个数值
        double Y = (arr[0] - b / a) * Math.exp(-a * (i + 1)) - (arr[0] - b / a)
                * Math.exp(-a * i);

        return Y;
    }

}