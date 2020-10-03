package com.algorithmpractice.other;

import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4});
        System.out.println(list.stream().reduce(0, (a,b) -> a + b));
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().mapToInt(Integer::valueOf).sum());
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
