//package com.algorithmpractice.leetcode;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StringToIntegerTest {
//
//    private StringToInteger stringToInteger;
//
//    @Before
//    public void setup(){
//        stringToInteger = new StringToInteger();
//    }
//
//    @Test
//    public void test1(){
//        assertEquals(42, stringToInteger.myAtoi("42"));
//    }
//
//    @Test
//    public void test2(){
//        assertEquals(-42, stringToInteger.myAtoi("   -42"));
//    }
//
//    @Test
//    public void test3(){
//        assertEquals(4193, stringToInteger.myAtoi("4193 with words"));
//    }
//
//    @Test
//    public void test4(){
//        assertEquals(-2147483648, stringToInteger.myAtoi("-91283472332"));
//    }
//
//    @Test
//    public void test5(){
//        assertEquals(0, stringToInteger.myAtoi("words and 987"));
//    }
//
//    @Test
//    public void test6(){
//        assertEquals(3, stringToInteger.myAtoi("3.14159"));
//    }
//}