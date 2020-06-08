//package com.algorithmpractice.leetcode;
//
//public class StringToInteger {
//
//    public int myAtoi(String str) {
//        str = str.trim();
//        boolean isNegative = false;
//
//        if(str.charAt(0)=='-'){
//            isNegative = true;
//            str = str.substring(1);
//        }else if(str.charAt(0)=='+') {
//            str = str.substring(1);
//        }
//
//        int total = 0;
//        int tens = str.length()-1;
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
//                return total;
//            }
//            int num = str.charAt(i) - '0';
//            total += num * Math.pow(10, tens);
//            tens--;
//        }
//
//        if(total>Integer && !isNegative){
//            return Integer.MAX_VALUE;
//        }else if(str.length()>10 && isNegative){
//            return Integer.MIN_VALUE;
//        }
//
//        return isNegative?-total:total;
//    }
//
//}
