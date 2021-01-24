package com.algorithmpractice.other;

import java.util.Arrays;
import java.util.List;

public class StringPool {

    public static void main(String[] args){
        String cat1 = "cat"; //this is stored in string pool, which is special space in heap
        String cat2 = "cat"; //this is reusing the constant found in the string pool
        String cat3 = new String("cat"); //this is in heap with the rest of objects

        System.out.println(cat1 == cat2);
        System.out.println(cat1 == cat3);

        
    }
}
