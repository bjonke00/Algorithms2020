package com.algorithmpractice.other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {


    public static void main(String[]args){
        Map<Character, Integer> chars = new HashMap<>();
        chars.put('a', 97);
        chars.put('b', 98);
        chars.put('z', 97+25);

        Iterator<Map.Entry<Character, Integer>> it = chars.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for(Map.Entry<Character, Integer> entry : chars.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        chars.forEach((k,v) -> System.out.println(k + " = " + v));

        chars.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

    }
}
