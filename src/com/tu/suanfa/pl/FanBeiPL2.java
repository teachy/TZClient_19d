package com.tu.suanfa.pl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FanBeiPL2 {
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static int[] bet = { 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 63, 69, 73, 75,
        75, 73, 69, 63, 55, 45, 36, 28, 21, 15, 10, 6, 3, 1 };
    static String temStr = "";
    public static int max=0;
    public static int tolmax=0;
    static List<Integer> otherList = new ArrayList<Integer>();
    static public void getList(List<Integer> resList, List<Integer> listjg,boolean res) {
        map.clear();
        listjg.clear();
        if(res){
            a(resList, null, listjg);
            b(resList, null, listjg);
            c(resList, null, listjg);
            d(resList, null, listjg);
            e(resList, null, listjg);
            f(resList, null, listjg);
            g(resList, null, listjg);
            h(resList, null, listjg);
            i(resList, null, listjg);
            j(resList, null, listjg);
            k(resList, null, listjg);
            l(resList, null, listjg);
            m(resList, null, listjg);
            n(resList, null, listjg);
            o(resList, null, listjg);
            p(resList, null, listjg);
            q(resList, null, listjg);
            r(resList, null, listjg);
            s(resList, null, listjg);
            t(resList, null, listjg);
            u(resList, null, listjg);
            v(resList, null, listjg);
            w(resList, null, listjg);
            x(resList, null, listjg);
            y(resList, null, listjg);
            z(resList, null, listjg);
            z1(resList, null, listjg);
            z2(resList, null, listjg);
            z3(resList, null, listjg);
            z4(resList, null, listjg);
            z5(resList, null, listjg);
            z6(resList, null, listjg);
            z7(resList, null, listjg);
            z8(resList, null, listjg);
            z9(resList, null, listjg);
            z10(resList, null, listjg);
            z11(resList, null, listjg);
            z12(resList, null, listjg);
            z13(resList, null, listjg);
            z14(resList, null, listjg);
            z15(resList, null, listjg);
            z16(resList, null, listjg);
            z17(resList, null, listjg);
            z18(resList, null, listjg);
            z19(resList, null, listjg);
            z20(resList, null, listjg);
            z21(resList, null, listjg);
            z22(resList, null, listjg);
            z23(resList, null, listjg);
            z24(resList, null, listjg);
            z25(resList, null, listjg);
            z26(resList, null, listjg);
            z27(resList, null, listjg);
            z28(resList, null, listjg);
            z29(resList, null, listjg);
            z30(resList, null, listjg);
            z31(resList, null, listjg);
            z32(resList, null, listjg);
            z33(resList, null, listjg);
            z34(resList, null, listjg);
            z35(resList, null, listjg);
            z36(resList, null, listjg);
            z37(resList, null, listjg);
            z38(resList, null, listjg);
            z39(resList, null, listjg);
            z40(resList, null, listjg);
            z41(resList, null, listjg);
            z42(resList, null, listjg);
            z43(resList, null, listjg);
            z44(resList, null, listjg);
            z45(resList, null, listjg);
            z46(resList, null, listjg);
            z47(resList, null, listjg);
            z48(resList, null, listjg);
            z49(resList, null, listjg);
            z50(resList, null, listjg);
            z51(resList, null, listjg);
            z52(resList, null, listjg);
            z53(resList, null, listjg);
            z54(resList, null, listjg);
            z55(resList, null, listjg);
            z56(resList, null, listjg);
            z57(resList, null, listjg);
            z58(resList, null, listjg);
            z59(resList, null, listjg);
            z60(resList, null, listjg);
            z61(resList, null, listjg);
            z62(resList, null, listjg);
            z63(resList, null, listjg);
            z64(resList, null, listjg);
            z65(resList, null, listjg);
            z66(resList, null, listjg);
            z67(resList, null, listjg);
            z68(resList, null, listjg);
            z69(resList, null, listjg);
            z70(resList, null, listjg);
            z71(resList, null, listjg);
            z72(resList, null, listjg);
            z73(resList, null, listjg);
            z74(resList, null, listjg);
            z75(resList, null, listjg);
            z76(resList, null, listjg);
            z77(resList, null, listjg);
            z78(resList, null, listjg);
            z79(resList, null, listjg);
            z80(resList, null, listjg);
            z81(resList, null, listjg);
            z82(resList, null, listjg);
            z83(resList, null, listjg);
            z84(resList, null, listjg);
            z85(resList, null, listjg);
            z86(resList, null, listjg);
            z87(resList, null, listjg);
            z88(resList, null, listjg);
            z89(resList, null, listjg);
            z90(resList, null, listjg);
            z91(resList, null, listjg);
            z92(resList, null, listjg);
            z93(resList, null, listjg);
            z94(resList, null, listjg);
            z95(resList, null, listjg);
            z96(resList, null, listjg);
            z97(resList, null, listjg);
            z98(resList, null, listjg);
            z99(resList, null, listjg);
            z100(resList, null, listjg);
            y1(resList, null, listjg);
            y2(resList, null, listjg);
            y3(resList, null, listjg);
            y4(resList, null, listjg);
            y5(resList, null, listjg);
            y6(resList, null, listjg);
            y7(resList, null, listjg);
            y8(resList, null, listjg);
            y9(resList, null, listjg);
            y10(resList, null, listjg);
            y11(resList, null, listjg);
            y12(resList, null, listjg);
            y13(resList, null, listjg);
            y14(resList, null, listjg);
            y15(resList, null, listjg);
            y16(resList, null, listjg);
            y17(resList, null, listjg);
            y18(resList, null, listjg);
            y19(resList, null, listjg);
            y20(resList, null, listjg);
            y21(resList, null, listjg);
            y22(resList, null, listjg);
            y23(resList, null, listjg);
            y24(resList, null, listjg);
            y25(resList, null, listjg);
            y26(resList, null, listjg);
            y27(resList, null, listjg);
            y28(resList, null, listjg);
            y29(resList, null, listjg);
            y30(resList, null, listjg);
            y31(resList, null, listjg);
            y32(resList, null, listjg);
            y33(resList, null, listjg);
            y34(resList, null, listjg);
            y35(resList, null, listjg);
            y36(resList, null, listjg);
            y37(resList, null, listjg);
            y38(resList, null, listjg);
            y39(resList, null, listjg);
            y40(resList, null, listjg);
            y41(resList, null, listjg);
            y42(resList, null, listjg);
            y43(resList, null, listjg);
            y44(resList, null, listjg);
            y45(resList, null, listjg);
            y46(resList, null, listjg);
            y47(resList, null, listjg);
            y48(resList, null, listjg);
            y49(resList, null, listjg);
            y50(resList, null, listjg);
            y51(resList, null, listjg);
            y52(resList, null, listjg);
            y53(resList, null, listjg);
            y54(resList, null, listjg);
            y55(resList, null, listjg);
            y56(resList, null, listjg);
            y57(resList, null, listjg);
            y58(resList, null, listjg);
            y59(resList, null, listjg);
            y60(resList, null, listjg);
            y61(resList, null, listjg);
            y62(resList, null, listjg);
            y63(resList, null, listjg);
            y64(resList, null, listjg);
            y65(resList, null, listjg);
            y66(resList, null, listjg);
            y67(resList, null, listjg);
            y68(resList, null, listjg);
            y69(resList, null, listjg);
            y70(resList, null, listjg);
            y71(resList, null, listjg);
            y72(resList, null, listjg);
            y73(resList, null, listjg);
            y74(resList, null, listjg);
            y75(resList, null, listjg);
            y76(resList, null, listjg);
            y77(resList, null, listjg);
            y78(resList, null, listjg);
            y79(resList, null, listjg);
            y80(resList, null, listjg);
            y81(resList, null, listjg);
            y82(resList, null, listjg);
            y83(resList, null, listjg);
            y84(resList, null, listjg);
            y85(resList, null, listjg);
            y86(resList, null, listjg);
            y87(resList, null, listjg);
            y88(resList, null, listjg);
            y89(resList, null, listjg);
            y90(resList, null, listjg);
            y91(resList, null, listjg);
            y92(resList, null, listjg);
            y93(resList, null, listjg);
            y94(resList, null, listjg);
            y95(resList, null, listjg);
            y96(resList, null, listjg);
            y97(resList, null, listjg);
            y98(resList, null, listjg);
            y99(resList, null, listjg);
            y100(resList, null, listjg);
            x1(resList, null, listjg);
            x2(resList, null, listjg);
            x3(resList, null, listjg);
            x4(resList, null, listjg);
            x5(resList, null, listjg);
            x6(resList, null, listjg);
            x7(resList, null, listjg);
            x8(resList, null, listjg);
            x9(resList, null, listjg);
            x10(resList, null, listjg);
            x11(resList, null, listjg);
            x12(resList, null, listjg);
            x13(resList, null, listjg);
            x14(resList, null, listjg);
            x15(resList, null, listjg);
            x16(resList, null, listjg);
            x17(resList, null, listjg);
            x18(resList, null, listjg);
            x19(resList, null, listjg);
            x20(resList, null, listjg);
            x21(resList, null, listjg);
            x22(resList, null, listjg);
            x23(resList, null, listjg);
            x24(resList, null, listjg);
            x25(resList, null, listjg);
            x26(resList, null, listjg);
            x27(resList, null, listjg);
            x28(resList, null, listjg);
            x29(resList, null, listjg);
            x30(resList, null, listjg);
            x31(resList, null, listjg);
            x32(resList, null, listjg);
            x33(resList, null, listjg);
            x34(resList, null, listjg);
            x35(resList, null, listjg);
            a1(resList, null, listjg);
            int[] all = new int[28];
            for(int i=0;i<=20;i++){
                max=0;
                for (Map.Entry<String, Integer> m : map.entrySet()) {
                    if (m.getValue() > max) {
                        max = m.getValue();
                        temStr = m.getKey();
                    }
                }
                map.remove(temStr);
                getjg(resList,listjg,temStr);
                for(Integer eve:listjg){
                    all[eve]++;
                }
                listjg.clear();
            }
            for(int j:resList){
                if(listjg.contains(j)){
                    
                }else{
                    listjg.add(j);
                }
            }
            int begin=0;
            while(begin<28){
                begin++;
                int tem=100;
                int temi=0;
                for(int i=0;i<=27;i++){
                   if(all[i]<tem){
                       tem=all[i];
                       temi=i;
                   }
                } 
                if(listjg.contains(temi)){
                    
                }else{
                    listjg.add(temi);
                }
                all[temi]=100;
                if(listjg.size()>=25){
                    break;
                }
            }
        }else{
            getjg(resList,listjg,temStr);
        }
        otherList.clear();
        for(int i=0;i<=27;i++){
            if(listjg.contains(i)){
                
            }else{
                otherList.add(i);
            }
        }
        System.out.println("###19d###:"+"listjg:"+listjg+" otherList："+otherList);
    }
    
    //大
    static public void a(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "a";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i >= 14) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i >= 14) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //小
    static public void b(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "b";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i <= 13) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i <= 13) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //单
    static public void c(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "c";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 2 != 0) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i % 2 != 0) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //双
    static public void d(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "d";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 2 == 0) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i % 2 == 0) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //大尾
    static public void e(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "e";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 10 >= 5) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i % 10 >= 5) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //小尾
    static public void f(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "f";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 10 < 5) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (i % 10 < 5) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //3u0
    static public void g(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "g";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 3 == 0) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 3;
            for (Integer i : resList) {
                if (i % 3 == 0) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //3u1
    static public void h(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "h";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 3 == 1) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 3;
            for (Integer i : resList) {
                if (i % 3 == 1) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
        
    }
    
    //3u2
    static public void i(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "i";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 3 == 2) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 3;
            for (Integer i : resList) {
                if (i % 3 == 2) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //4u0
    static public void j(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "j";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 4 == 0) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 4;
            for (Integer i : resList) {
                if (i % 4 == 0) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //4u1
    static public void k(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "k";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 4 == 1) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 4;
            for (Integer i : resList) {
                if (i % 4 == 1) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //4u2
    static public void l(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "l";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 4 == 2) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 4;
            for (Integer i : resList) {
                if (i % 4 == 2) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //4u3
    static public void m(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "m";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 4 == 3) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 4;
            for (Integer i : resList) {
                if (i % 4 == 3) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //5u0
    static public void n(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "n";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 5 == 0) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 5;
            for (Integer i : resList) {
                if (i % 5 == 0) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //5u1
    static public void o(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "o";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 5 == 1) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 5;
            for (Integer i : resList) {
                if (i % 5 == 1) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //5u2
    static public void p(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "p";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 5 == 2) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 5;
            for (Integer i : resList) {
                if (i % 5 == 2) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //5u3
    static public void q(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "q";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 5 == 3) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 5;
            for (Integer i : resList) {
                if (i % 5 == 3) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //5u4
    static public void r(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "r";
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (i % 5 == 4) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 5;
            for (Integer i : resList) {
                if (i % 5 == 4) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01235尾
    static public void s(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "s";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01236
    static public void t(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "t";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01237
    static public void u(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "u";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01238
    static public void v(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "v";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01239
    static public void w(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "w";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01245
    static public void x(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01246
    static public void y(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01247
    static public void z(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01248
    static public void z1(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z1";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01249
    static public void z2(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z2";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01256
    static public void z3(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z3";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01257
    static public void z4(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z4";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01258
    static public void z5(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z5";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01259
    static public void z6(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z6";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01267
    static public void z7(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z7";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01268
    static public void z8(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z8";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
  //01269
    static public void z9(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z9";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
  //01278
    static public void z10(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z10";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
  //01279
    static public void z11(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z11";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
  //01289
    static public void z12(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z12";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01345
    static public void z13(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z13";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01346
    static public void z14(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z14";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01347
    static public void z15(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z15";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01348
    static public void z16(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z16";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01349
    static public void z17(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z17";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01356
    static public void z18(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z18";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01357
    static public void z19(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z19";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01358
    static public void z20(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z20";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01359
    static public void z21(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z21";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01367
    static public void z22(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z22";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01368
    static public void z23(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z23";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01369
    static public void z24(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z24";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01378
    static public void z25(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z25";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01379
    static public void z26(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z26";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01389
    static public void z27(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z27";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(3);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01456
    static public void z28(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z28";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01457
    static public void z29(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z29";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01458
    static public void z30(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z30";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01459
    static public void z31(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z31";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01467
    static public void z32(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z32";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01468
    static public void z33(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z33";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01469
    static public void z34(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z34";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01478
    static public void z35(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z35";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01479
    static public void z36(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z36";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //01489
    static public void z37(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z37";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01567
    static public void z38(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z38";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01568
    static public void z39(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z39";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01569
    static public void z40(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z40";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01578
    static public void z41(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z41";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01579
    static public void z42(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z42";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01589
    static public void z43(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z43";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01678
    static public void z44(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z44";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01679
    static public void z45(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z45";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01689
    static public void z46(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z46";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //01789
    static public void z47(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z47";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(1);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02345
    static public void z48(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z48";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02346
    static public void z49(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z49";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02347
    static public void z50(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z50";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02348
    static public void z51(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z51";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02349
    static public void z52(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z52";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02356
    static public void z53(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z53";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //02357
    static public void z54(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z54";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02358
    static public void z55(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z55";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02359
    static public void z56(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z56";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02367
    static public void z57(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z57";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02368
    static public void z58(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z58";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02369
    static public void z59(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z59";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02378
    static public void z60(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z60";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02379
    static public void z61(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z61";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02389
    static public void z62(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z62";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02456
    static public void z63(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z63";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02457
    static public void z64(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z64";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02458
    static public void z65(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z65";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02459
    static public void z66(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z66";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02467
    static public void z67(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z67";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02468
    static public void z68(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z68";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02469
    static public void z69(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z69";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02478
    static public void z70(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z70";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02479
    static public void z71(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z71";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //02489
    static public void z72(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z72";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //02567
    static public void z73(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z73";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    
    //02568
    static public void z74(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z74";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02569
    static public void z75(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z75";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02578
    static public void z76(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z76";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02579
    static public void z77(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z77";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02589
    static public void z78(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z78";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02678
    static public void z79(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z79";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02679
    static public void z80(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z80";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02689
    static public void z81(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z81";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //02789
    static public void z82(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z82";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(2);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03456
    static public void z83(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z83";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03457
    static public void z84(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z84";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03458
    static public void z85(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z85";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03459
    static public void z86(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z86";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03567
    static public void z87(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z87";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03568
    static public void z88(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z88";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03569
    static public void z89(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z89";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03578
    static public void z90(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z90";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03579
    static public void z91(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z91";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03589
    static public void z92(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z92";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03678
    static public void z93(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z93";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03679
    static public void z94(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z94";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //03689
    static public void z95(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z95";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //03789
    static public void z96(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z96";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(3);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04567
    static public void z97(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z97";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04568
    static public void z98(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z98";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04569
    static public void z99(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z99";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04578
    static public void z100(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "z100";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04579
    static public void y1(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y1";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04589
    static public void y2(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y2";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04678
    static public void y3(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y3";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04679
    static public void y4(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y4";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04689
    static public void y5(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y5";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //04789
    static public void y6(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y6";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //05678
    static public void y7(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y7";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //05679
    static public void y8(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y8";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //05689
    static public void y9(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y9";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //05789
    static public void y10(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y10";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //06789
    static public void y11(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y11";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(0);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12345
    static public void y12(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y12";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12346
    static public void y13(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y13";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12347
    static public void y14(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y14";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12348
    static public void y15(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y15";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12349
    static public void y16(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y16";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12356
    static public void y17(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y17";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12357
    static public void y18(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y18";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12358
    static public void y19(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y19";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //12359
    static public void y20(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y20";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12367
    static public void y21(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y21";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12368
    static public void y22(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y22";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12369
    static public void y23(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y23";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12378
    static public void y24(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y24";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12379
    static public void y25(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y25";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12389
    static public void y26(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y26";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12456
    static public void y27(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y27";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12457
    static public void y28(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y28";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12458
    static public void y29(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y29";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12459
    static public void y30(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y30";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12467
    static public void y31(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y31";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12468
    static public void y32(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y32";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12469
    static public void y33(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y33";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12478
    static public void y34(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y34";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12479
    static public void y35(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y35";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12489
    static public void y36(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y36";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(4);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12567
    static public void y37(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y37";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12568
    static public void y38(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y38";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12569
    static public void y39(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y39";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12578
    static public void y40(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y40";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12579
    static public void y41(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y41";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12589
    static public void y42(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y42";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12678
    static public void y43(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y43";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12679
    static public void y44(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y44";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //12789
    static public void y45(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y45";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(2);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13456
    static public void y46(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y46";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13457
    static public void y47(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y47";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13458
    static public void y48(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y48";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13459
    static public void y49(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y49";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13467
    static public void y50(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y50";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //13468
    static public void y51(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y51";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13469
    static public void y52(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y52";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13478
    static public void y53(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y53";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13479
    static public void y54(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y54";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13489
    static public void y55(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y55";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(4);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13567
    static public void y56(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y56";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13568
    static public void y57(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y57";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13569
    static public void y58(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y58";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13578
    static public void y59(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y59";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13579
    static public void y60(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y60";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13589
    static public void y61(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y61";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13678
    static public void y62(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y62";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13679
    static public void y63(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y63";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13689
    static public void y64(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y64";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //13789
    static public void y65(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y65";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(3);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14567
    static public void y66(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y66";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14568
    static public void y67(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y67";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14569
    static public void y68(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y68";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14578
    static public void y69(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y69";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14579
    static public void y70(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y70";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14589
    static public void y71(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y71";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14678
    static public void y72(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y72";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14679
    static public void y73(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y73";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14689
    static public void y74(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y74";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //14789
    static public void y75(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y75";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //15678
    static public void y76(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y76";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //15679
    static public void y77(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y77";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //15689
    static public void y78(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y78";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //15789
    static public void y79(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y79";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //16789
    static public void y80(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y80";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(1);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //23456
    static public void y81(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y81";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //23457
    static public void y82(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y82";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23458
    static public void y83(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y83";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23459
    static public void y84(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y84";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23467
    static public void y85(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y85";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23468
    static public void y86(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y86";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23469
    static public void y87(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y87";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23478
    static public void y88(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y88";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23479
    static public void y89(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y89";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23489
    static public void y90(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y90";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23567
    static public void y91(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y91";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23568
    static public void y92(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y92";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23569
    static public void y93(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y93";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23578
    static public void y94(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y94";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23579
    static public void y95(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y95";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23589
    static public void y96(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y96";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //23678
    static public void y97(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y97";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //23679
    static public void y98(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y98";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //23689
    static public void y99(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y99";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //23789
    static public void y100(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "y100";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(3);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //24567
    static public void x1(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x1";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //24568
    static public void x2(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x2";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24569
    static public void x3(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x3";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24578
    static public void x4(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x4";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24579
    static public void x5(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x5";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24589
    static public void x6(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x6";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24678
    static public void x7(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x7";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24679
    static public void x8(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x8";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24689
    static public void x9(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x9";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //24789
    static public void x10(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x10";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //25678
    static public void x11(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x11";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //25679
    static public void x12(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x12";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //25689
    static public void x13(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x13";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //25789
    static public void x14(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x14";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //26789
    static public void x15(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x15";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34567
    static public void x16(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x16";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34568
    static public void x17(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x17";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34569
    static public void x18(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x18";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34578
    static public void x19(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x19";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34579
    static public void x20(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x20";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34589
    static public void x21(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x21";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34678
    static public void x22(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x22";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34679
    static public void x23(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x23";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    //34689
    static public void x24(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x24";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //34789
    static public void x25(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x25";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //35678
    static public void x26(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x26";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //35679
    static public void x27(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x27";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //35689
    static public void x28(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x28";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //35789
    static public void x29(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x29";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //36789
    static public void x30(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x30";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(3);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //45678
    static public void x31(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x31";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //45679
    static public void x32(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x32";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //45689
    static public void x33(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x33";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //45789
    static public void x34(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x34";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(4);
        l.add(5);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    //46789
    static public void x35(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "x35";
        List<Integer> l = new ArrayList<Integer>(5);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        if (temp.equals(str)) {
            for (int i = 0; i <= 27; i++) {
                if (l.contains(i % 10)) {
                    listjg.add(i);
                }
            }
        } else {
            Integer count = 1;
            int gl = 2;
            for (Integer i : resList) {
                if (l.contains(i % 10)) {
                    count = count * gl;
                } else {
                    break;
                }
            }
            map.put(temp, count);
        }
    }
    
    
    //a1
    static public void a1(List<Integer> resList, String str, List<Integer> listjg) {
        String temp = "a1";
        String[] allstr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        Zuhe.list.clear();
        List<Integer> temList = new ArrayList<Integer>(14);
        for(int i=2;i<=13;i++){
            Zuhe.getNext(null, allstr,i);
        }
        for(int i=0;i<=13;i++){
            temList.add(i);
        }
        Integer count = 1;
        Integer max = 1;
        int gl = 2;  
        if (temp.equals(str)) {
            for(int i=0;i<Zuhe.list.size();i++){
                count = 1;
                List<Integer> l = new ArrayList<Integer>(14);
                List<Integer> teml = new ArrayList<Integer>(14);
                List<String> tem = Arrays.asList(((String) Zuhe.list.get(i)).split("-"));
                for(String s:tem){
                    teml.add(Integer.parseInt(s));
                }
                for(int j=0;j<=13;j++){
                    if(teml.contains(j)){
                        l.add(j);
                    }else{
                        l.add(27-j);
                    }
                }
                for (Integer q : resList) {
                    if (l.contains(q)) {
                        count = count * gl;
                    } else {
                        break;
                    }
                }
                if(count>max){
                    max=count;
                    listjg.clear();
                    listjg.addAll(l);
                }
            }
        } else {
            for(int i=0;i<Zuhe.list.size();i++){
                count=1;
                List<Integer> l = new ArrayList<Integer>(14);
                List<Integer> teml = new ArrayList<Integer>(14);
                List<String> tem = Arrays.asList(((String) Zuhe.list.get(i)).split("-"));
                for(String s:tem){
                    teml.add(Integer.parseInt(s));
                }
                for(int j=0;j<=13;j++){
                    if(teml.contains(j)){
                        l.add(j);
                    }else{
                        l.add(27-j);
                    }
                }
                for (Integer q : resList) {
                    if (l.contains(q)) {
                        count = count * gl;
                    } else {
                        break;
                    }
                }
                if(count>max){
                    max=count;
                    map.put(temp, count); 
                }
            }
        }
    }
    
    
    static void getjg(List<Integer> resList, List<Integer> listjg,String temStr){
        if (temStr.equals("a")) {
            a(resList, temStr, listjg);
        } else if (temStr.equals("b")) {
            b(resList, temStr, listjg);
        } else if (temStr.equals("c")) {
            c(resList, temStr, listjg);
        } else if (temStr.equals("d")) {
            d(resList, temStr, listjg);
        } else if (temStr.equals("e")) {
            e(resList, temStr, listjg);
        } else if (temStr.equals("f")) {
            f(resList, temStr, listjg);
        } else if (temStr.equals("g")) {
            g(resList, temStr, listjg);
        } else if (temStr.equals("h")) {
            h(resList, temStr, listjg);
        } else if (temStr.equals("i")) {
            i(resList, temStr, listjg);
        } else if (temStr.equals("j")) {
            j(resList, temStr, listjg);
        } else if (temStr.equals("k")) {
            k(resList, temStr, listjg);
        } else if (temStr.equals("l")) {
            l(resList, temStr, listjg);
        } else if (temStr.equals("m")) {
            m(resList, temStr, listjg);
        } else if (temStr.equals("n")) {
            n(resList, temStr, listjg);
        } else if (temStr.equals("o")) {
            o(resList, temStr, listjg);
        } else if (temStr.equals("p")) {
            p(resList, temStr, listjg);
        } else if (temStr.equals("q")) {
            q(resList, temStr, listjg);
        } else if (temStr.equals("r")) {
            r(resList, temStr, listjg);
        } else if (temStr.equals("s")) {
            s(resList, temStr, listjg);
        } else if (temStr.equals("t")) {
            t(resList, temStr, listjg);
        } else if (temStr.equals("u")) {
            u(resList, temStr, listjg);
        } else if (temStr.equals("v")) {
            v(resList, temStr, listjg);
        } else if (temStr.equals("w")) {
            w(resList, temStr, listjg);
        } else if (temStr.equals("x")) {
            x(resList, temStr, listjg);
        } else if (temStr.equals("y")) {
            y(resList, temStr, listjg);
        } else if (temStr.equals("z")) {
            z(resList, temStr, listjg);
        } else if (temStr.equals("z1")) {
            z1(resList, temStr, listjg);
        } else if (temStr.equals("z2")) {
            z2(resList, temStr, listjg);
        } else if (temStr.equals("z3")) {
            z3(resList, temStr, listjg);
        } else if (temStr.equals("z4")) {
            z4(resList, temStr, listjg);
        } else if (temStr.equals("z5")) {
            z5(resList, temStr, listjg);
        } else if (temStr.equals("z6")) {
            z6(resList, temStr, listjg);
        } else if (temStr.equals("z7")) {
            z7(resList, temStr, listjg);
        } else if (temStr.equals("z8")) {
            z8(resList, temStr, listjg);
        } else if (temStr.equals("z9")) {
            z9(resList, temStr, listjg);
        } else if (temStr.equals("z10")) {
            z10(resList, temStr, listjg);
        } else if (temStr.equals("z11")) {
            z11(resList, temStr, listjg);
        } else if (temStr.equals("z12")) {
            z12(resList, temStr, listjg);
        } else if (temStr.equals("z13")) {
            z13(resList, temStr, listjg);
        } else if (temStr.equals("z14")) {
            z14(resList, temStr, listjg);
        } else if (temStr.equals("z15")) {
            z15(resList, temStr, listjg);
        } else if (temStr.equals("z16")) {
            z16(resList, temStr, listjg);
        } else if (temStr.equals("z17")) {
            z17(resList, temStr, listjg);
        } else if (temStr.equals("z18")) {
            z18(resList, temStr, listjg);
        } else if (temStr.equals("z19")) {
            z19(resList, temStr, listjg);
        } else if (temStr.equals("z20")) {
            z20(resList, temStr, listjg);
        } else if (temStr.equals("z21")) {
            z21(resList, temStr, listjg);
        } else if (temStr.equals("z22")) {
            z22(resList, temStr, listjg);
        } else if (temStr.equals("z23")) {
            z23(resList, temStr, listjg);
        } else if (temStr.equals("z24")) {
            z24(resList, temStr, listjg);
        } else if (temStr.equals("z25")) {
            z25(resList, temStr, listjg);
        } else if (temStr.equals("z26")) {
            z26(resList, temStr, listjg);
        } else if (temStr.equals("z27")) {
            z27(resList, temStr, listjg);
        } else if (temStr.equals("z28")) {
            z28(resList, temStr, listjg);
        } else if (temStr.equals("z29")) {
            z29(resList, temStr, listjg);
        } else if (temStr.equals("z30")) {
            z30(resList, temStr, listjg);
        } else if (temStr.equals("z31")) {
            z31(resList, temStr, listjg);
        } else if (temStr.equals("z32")) {
            z32(resList, temStr, listjg);
        } else if (temStr.equals("z33")) {
            z33(resList, temStr, listjg);
        } else if (temStr.equals("z34")) {
            z34(resList, temStr, listjg);
        } else if (temStr.equals("z35")) {
            z35(resList, temStr, listjg);
        } else if (temStr.equals("z36")) {
            z36(resList, temStr, listjg);
        } else if (temStr.equals("z37")) {
            z37(resList, temStr, listjg);
        } else if (temStr.equals("z38")) {
            z38(resList, temStr, listjg);
        } else if (temStr.equals("z39")) {
            z39(resList, temStr, listjg);
        } else if (temStr.equals("z40")) {
            z40(resList, temStr, listjg);
        } else if (temStr.equals("z41")) {
            z41(resList, temStr, listjg);
        } else if (temStr.equals("z42")) {
            z42(resList, temStr, listjg);
        } else if (temStr.equals("z43")) {
            z43(resList, temStr, listjg);
        } else if (temStr.equals("z44")) {
            z44(resList, temStr, listjg);
        } else if (temStr.equals("z45")) {
            z45(resList, temStr, listjg);
        } else if (temStr.equals("z46")) {
            z46(resList, temStr, listjg);
        } else if (temStr.equals("z47")) {
            z47(resList, temStr, listjg);
        } else if (temStr.equals("z48")) {
            z48(resList, temStr, listjg);
        } else if (temStr.equals("z49")) {
            z49(resList, temStr, listjg);
        } else if (temStr.equals("z50")) {
            z50(resList, temStr, listjg);
        } else if (temStr.equals("z51")) {
            z51(resList, temStr, listjg);
        } else if (temStr.equals("z52")) {
            z52(resList, temStr, listjg);
        } else if (temStr.equals("z53")) {
            z53(resList, temStr, listjg);
        } else if (temStr.equals("z54")) {
            z54(resList, temStr, listjg);
        } else if (temStr.equals("z55")) {
            z55(resList, temStr, listjg);
        } else if (temStr.equals("z56")) {
            z56(resList, temStr, listjg);
        } else if (temStr.equals("z57")) {
            z57(resList, temStr, listjg);
        } else if (temStr.equals("z58")) {
            z58(resList, temStr, listjg);
        } else if (temStr.equals("z59")) {
            z59(resList, temStr, listjg);
        } else if (temStr.equals("z60")) {
            z60(resList, temStr, listjg);
        } else if (temStr.equals("z61")) {
            z61(resList, temStr, listjg);
        } else if (temStr.equals("z62")) {
            z62(resList, temStr, listjg);
        } else if (temStr.equals("z63")) {
            z63(resList, temStr, listjg);
        } else if (temStr.equals("z64")) {
            z64(resList, temStr, listjg);
        } else if (temStr.equals("z65")) {
            z65(resList, temStr, listjg);
        } else if (temStr.equals("z66")) {
            z66(resList, temStr, listjg);
        } else if (temStr.equals("z67")) {
            z67(resList, temStr, listjg);
        } else if (temStr.equals("z68")) {
            z68(resList, temStr, listjg);
        } else if (temStr.equals("z69")) {
            z69(resList, temStr, listjg);
        } else if (temStr.equals("z70")) {
            z70(resList, temStr, listjg);
        } else if (temStr.equals("z71")) {
            z71(resList, temStr, listjg);
        } else if (temStr.equals("z72")) {
            z72(resList, temStr, listjg);
        }  else if (temStr.equals("z73")) {
            z73(resList, temStr, listjg);
        } else if (temStr.equals("z74")) {
            z74(resList, temStr, listjg);
        } else if (temStr.equals("z75")) {
            z75(resList, temStr, listjg);
        } else if (temStr.equals("z76")) {
            z76(resList, temStr, listjg);
        } else if (temStr.equals("z77")) {
            z77(resList, temStr, listjg);
        } else if (temStr.equals("z78")) {
            z78(resList, temStr, listjg);
        }  else if (temStr.equals("z79")) {
            z79(resList, temStr, listjg);
        } else if (temStr.equals("z80")) {
            z80(resList, temStr, listjg);
        } else if (temStr.equals("z81")) {
            z81(resList, temStr, listjg);
        } else if (temStr.equals("z82")) {
            z82(resList, temStr, listjg);
        } else if (temStr.equals("z83")) {
            z83(resList, temStr, listjg);
        } else if (temStr.equals("z84")) {
            z84(resList, temStr, listjg);
        }  else if (temStr.equals("z85")) {
            z85(resList, temStr, listjg);
        }  else if (temStr.equals("z86")) {
            z86(resList, temStr, listjg);
        }  else if (temStr.equals("z87")) {
            z87(resList, temStr, listjg);
        }  else if (temStr.equals("z88")) {
            z88(resList, temStr, listjg);
        }  else if (temStr.equals("z89")) {
            z89(resList, temStr, listjg);
        }  else if (temStr.equals("z90")) {
            z90(resList, temStr, listjg);
        }  else if (temStr.equals("z91")) {
            z91(resList, temStr, listjg);
        }  else if (temStr.equals("z92")) {
            z92(resList, temStr, listjg);
        }  else if (temStr.equals("z93")) {
            z93(resList, temStr, listjg);
        }  else if (temStr.equals("z94")) {
            z94(resList, temStr, listjg);
        }  else if (temStr.equals("z95")) {
            z95(resList, temStr, listjg);
        }  else if (temStr.equals("z96")) {
            z96(resList, temStr, listjg);
        }  else if (temStr.equals("z97")) {
            z97(resList, temStr, listjg);
        }  else if (temStr.equals("z98")) {
            z98(resList, temStr, listjg);
        }  else if (temStr.equals("z99")) {
            z99(resList, temStr, listjg);
        }  else if (temStr.equals("z100")) {
            z100(resList, temStr, listjg);
        }   else if (temStr.equals("y1")) {
            y1(resList, temStr, listjg);
        }   else if (temStr.equals("y2")) {
            y2(resList, temStr, listjg);
        }   else if (temStr.equals("y3")) {
            y3(resList, temStr, listjg);
        }   else if (temStr.equals("y4")) {
            y4(resList, temStr, listjg);
        }   else if (temStr.equals("y5")) {
            y5(resList, temStr, listjg);
        }   else if (temStr.equals("y6")) {
            y6(resList, temStr, listjg);
        }   else if (temStr.equals("y7")) {
            y7(resList, temStr, listjg);
        }   else if (temStr.equals("y8")) {
            y8(resList, temStr, listjg);
        }   else if (temStr.equals("y9")) {
            y9(resList, temStr, listjg);
        }   else if (temStr.equals("y10")) {
            y10(resList, temStr, listjg);
        }  else if (temStr.equals("y11")) {
            y11(resList, temStr, listjg);
        }   else if (temStr.equals("y12")) {
            y12(resList, temStr, listjg);
        }   else if (temStr.equals("y13")) {
            y13(resList, temStr, listjg);
        }   else if (temStr.equals("y14")) {
            y14(resList, temStr, listjg);
        }   else if (temStr.equals("y15")) {
            y15(resList, temStr, listjg);
        }   else if (temStr.equals("y16")) {
            y16(resList, temStr, listjg);
        }   else if (temStr.equals("y17")) {
            y17(resList, temStr, listjg);
        }   else if (temStr.equals("y18")) {
            y18(resList, temStr, listjg);
        }   else if (temStr.equals("y19")) {
            y19(resList, temStr, listjg);
        }   else if (temStr.equals("y20")) {
            y20(resList, temStr, listjg);
        }  else if (temStr.equals("y21")) {
            y21(resList, temStr, listjg);
        }   else if (temStr.equals("y22")) {
            y22(resList, temStr, listjg);
        }   else if (temStr.equals("y23")) {
            y23(resList, temStr, listjg);
        }   else if (temStr.equals("y24")) {
            y24(resList, temStr, listjg);
        }   else if (temStr.equals("y25")) {
            y25(resList, temStr, listjg);
        }   else if (temStr.equals("y26")) {
            y26(resList, temStr, listjg);
        }   else if (temStr.equals("y27")) {
            y27(resList, temStr, listjg);
        }   else if (temStr.equals("y28")) {
            y28(resList, temStr, listjg);
        }   else if (temStr.equals("y29")) {
            y29(resList, temStr, listjg);
        }   else if (temStr.equals("y30")) {
            y30(resList, temStr, listjg);
        }  else if (temStr.equals("y31")) {
            y31(resList, temStr, listjg);
        }   else if (temStr.equals("y32")) {
            y32(resList, temStr, listjg);
        }   else if (temStr.equals("y33")) {
            y33(resList, temStr, listjg);
        }   else if (temStr.equals("y34")) {
            y34(resList, temStr, listjg);
        }   else if (temStr.equals("y35")) {
            y35(resList, temStr, listjg);
        }   else if (temStr.equals("y36")) {
            y36(resList, temStr, listjg);
        }   else if (temStr.equals("y37")) {
            y37(resList, temStr, listjg);
        }   else if (temStr.equals("y38")) {
            y38(resList, temStr, listjg);
        }   else if (temStr.equals("y39")) {
            y39(resList, temStr, listjg);
        }   else if (temStr.equals("y40")) {
            y40(resList, temStr, listjg);
        }  else if (temStr.equals("y41")) {
            y41(resList, temStr, listjg);
        }   else if (temStr.equals("y42")) {
            y42(resList, temStr, listjg);
        }   else if (temStr.equals("y43")) {
            y43(resList, temStr, listjg);
        }   else if (temStr.equals("y44")) {
            y44(resList, temStr, listjg);
        }   else if (temStr.equals("y45")) {
            y45(resList, temStr, listjg);
        }   else if (temStr.equals("y46")) {
            y46(resList, temStr, listjg);
        }   else if (temStr.equals("y47")) {
            y47(resList, temStr, listjg);
        }   else if (temStr.equals("y48")) {
            y48(resList, temStr, listjg);
        }   else if (temStr.equals("y49")) {
            y49(resList, temStr, listjg);
        }   else if (temStr.equals("y50")) {
            y50(resList, temStr, listjg);
        }  else if (temStr.equals("y51")) {
            y51(resList, temStr, listjg);
        }   else if (temStr.equals("y52")) {
            y52(resList, temStr, listjg);
        }   else if (temStr.equals("y53")) {
            y53(resList, temStr, listjg);
        }   else if (temStr.equals("y54")) {
            y54(resList, temStr, listjg);
        }   else if (temStr.equals("y55")) {
            y55(resList, temStr, listjg);
        }   else if (temStr.equals("y56")) {
            y56(resList, temStr, listjg);
        }   else if (temStr.equals("y57")) {
            y57(resList, temStr, listjg);
        }   else if (temStr.equals("y58")) {
            y58(resList, temStr, listjg);
        }   else if (temStr.equals("y59")) {
            y59(resList, temStr, listjg);
        }   else if (temStr.equals("y60")) {
            y60(resList, temStr, listjg);
        }  else if (temStr.equals("y61")) {
            y61(resList, temStr, listjg);
        }   else if (temStr.equals("y62")) {
            y62(resList, temStr, listjg);
        }   else if (temStr.equals("y63")) {
            y63(resList, temStr, listjg);
        }   else if (temStr.equals("y64")) {
            y64(resList, temStr, listjg);
        }   else if (temStr.equals("y65")) {
            y65(resList, temStr, listjg);
        }   else if (temStr.equals("y66")) {
            y66(resList, temStr, listjg);
        }   else if (temStr.equals("y67")) {
            y67(resList, temStr, listjg);
        }   else if (temStr.equals("y68")) {
            y68(resList, temStr, listjg);
        }   else if (temStr.equals("y69")) {
            y69(resList, temStr, listjg);
        }   else if (temStr.equals("y70")) {
            y70(resList, temStr, listjg);
        }  else if (temStr.equals("y71")) {
            y71(resList, temStr, listjg);
        }   else if (temStr.equals("y72")) {
            y72(resList, temStr, listjg);
        }   else if (temStr.equals("y73")) {
            y73(resList, temStr, listjg);
        }   else if (temStr.equals("y74")) {
            y74(resList, temStr, listjg);
        }   else if (temStr.equals("y75")) {
            y75(resList, temStr, listjg);
        }   else if (temStr.equals("y76")) {
            y76(resList, temStr, listjg);
        }   else if (temStr.equals("y77")) {
            y77(resList, temStr, listjg);
        }   else if (temStr.equals("y78")) {
            y78(resList, temStr, listjg);
        }   else if (temStr.equals("y79")) {
            y79(resList, temStr, listjg);
        }   else if (temStr.equals("y80")) {
            y80(resList, temStr, listjg);
        }  else if (temStr.equals("y81")) {
            y81(resList, temStr, listjg);
        }   else if (temStr.equals("y82")) {
            y82(resList, temStr, listjg);
        }   else if (temStr.equals("y83")) {
            y83(resList, temStr, listjg);
        }   else if (temStr.equals("y84")) {
            y84(resList, temStr, listjg);
        }   else if (temStr.equals("y85")) {
            y85(resList, temStr, listjg);
        }   else if (temStr.equals("y86")) {
            y86(resList, temStr, listjg);
        }   else if (temStr.equals("y87")) {
            y87(resList, temStr, listjg);
        }   else if (temStr.equals("y88")) {
            y88(resList, temStr, listjg);
        }   else if (temStr.equals("y89")) {
            y89(resList, temStr, listjg);
        }   else if (temStr.equals("y90")) {
            y90(resList, temStr, listjg);
        }  else if (temStr.equals("y91")) {
            y91(resList, temStr, listjg);
        }   else if (temStr.equals("y92")) {
            y92(resList, temStr, listjg);
        }   else if (temStr.equals("y93")) {
            y93(resList, temStr, listjg);
        }   else if (temStr.equals("y94")) {
            y94(resList, temStr, listjg);
        }   else if (temStr.equals("y95")) {
            y95(resList, temStr, listjg);
        }   else if (temStr.equals("y96")) {
            y96(resList, temStr, listjg);
        }   else if (temStr.equals("y97")) {
            y97(resList, temStr, listjg);
        }   else if (temStr.equals("y98")) {
            y98(resList, temStr, listjg);
        }   else if (temStr.equals("y99")) {
            y99(resList, temStr, listjg);
        }   else if (temStr.equals("y100")) {
            y100(resList, temStr, listjg);
        }   else if (temStr.equals("x1")) {
            x1(resList, temStr, listjg);
        }   else if (temStr.equals("x2")) {
            x2(resList, temStr, listjg);
        }   else if (temStr.equals("x3")) {
            x3(resList, temStr, listjg);
        }   else if (temStr.equals("x4")) {
            x4(resList, temStr, listjg);
        }   else if (temStr.equals("x5")) {
            x5(resList, temStr, listjg);
        }   else if (temStr.equals("x6")) {
            x6(resList, temStr, listjg);
        }   else if (temStr.equals("x7")) {
            x7(resList, temStr, listjg);
        }   else if (temStr.equals("x8")) {
            x8(resList, temStr, listjg);
        }   else if (temStr.equals("x9")) {
            x9(resList, temStr, listjg);
        }   else if (temStr.equals("x10")) {
            x10(resList, temStr, listjg);
        }   else if (temStr.equals("x11")) {
            x11(resList, temStr, listjg);
        }   else if (temStr.equals("x12")) {
            x12(resList, temStr, listjg);
        }   else if (temStr.equals("x13")) {
            x13(resList, temStr, listjg);
        }   else if (temStr.equals("x14")) {
            x14(resList, temStr, listjg);
        }   else if (temStr.equals("x15")) {
            x15(resList, temStr, listjg);
        }   else if (temStr.equals("x16")) {
            x16(resList, temStr, listjg);
        }   else if (temStr.equals("x17")) {
            x17(resList, temStr, listjg);
        }   else if (temStr.equals("x18")) {
            x18(resList, temStr, listjg);
        }   else if (temStr.equals("x19")) {
            x19(resList, temStr, listjg);
        }   else if (temStr.equals("x20")) {
            x20(resList, temStr, listjg);
        }   else if (temStr.equals("x21")) {
            x21(resList, temStr, listjg);
        }   else if (temStr.equals("x22")) {
            x22(resList, temStr, listjg);
        }   else if (temStr.equals("x23")) {
            x23(resList, temStr, listjg);
        }   else if (temStr.equals("x24")) {
            x24(resList, temStr, listjg);
        }   else if (temStr.equals("x25")) {
            x25(resList, temStr, listjg);
        }   else if (temStr.equals("x26")) {
            x26(resList, temStr, listjg);
        }   else if (temStr.equals("x27")) {
            x27(resList, temStr, listjg);
        }   else if (temStr.equals("x28")) {
            x28(resList, temStr, listjg);
        }   else if (temStr.equals("x29")) {
            x29(resList, temStr, listjg);
        }   else if (temStr.equals("x30")) {
            x30(resList, temStr, listjg);
        }   else if (temStr.equals("x31")) {
            x31(resList, temStr, listjg);
        }   else if (temStr.equals("x32")) {
            x32(resList, temStr, listjg);
        }   else if (temStr.equals("x33")) {
            x33(resList, temStr, listjg);
        }   else if (temStr.equals("x34")) {
            x34(resList, temStr, listjg);
        }   else if (temStr.equals("x35")) {
            x35(resList, temStr, listjg);
        }   else if (temStr.equals("a1")) {
            a1(resList, temStr, listjg);
        } 
    }
}