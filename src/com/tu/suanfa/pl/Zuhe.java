package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zuhe {
    //全局变量，存储所有字符组合
    static List<Object> list = new ArrayList<Object>();

    static public void getNext(String begin, String[] s, int num) {
        if (num > 1) {
            for (int i = 0; i < s.length - num+1; i++) {
                //取出一个字符
                String  str = s[i];
                //数组后边的元素组成新数组
                String[] newS = Arrays.copyOfRange(s, i + 1, s.length);
                //递归，从后面的n-1个数种选出num-1个
                getNext(begin == null ? str : (begin + "-" + str), newS,num - 1);
            }
        } else {
            //如果从剩下的s中选出1个数，那么前缀依次和s中的所有元素组合一次
            for (int b = 0; b < s.length; b++) {
                list.add(begin + "-" + s[b]);
            }

        }

    }

    /**
     * @param args
     *            Administrator 2013-4-23 下午2:15:43
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] str = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        Zuhe z = new Zuhe();
        for(int i=1;i<=13;i++){
            z.getNext(null, str,i);
        }
        
        System.out.println(z.list.size());
    }
}