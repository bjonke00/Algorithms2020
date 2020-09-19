package com.algorithmpractice.leetcode.medium;

import java.io.*;
import java.sql.Connection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchSuggestedProducts {

    public static List<List<String>> suggestedProducts(List<String> products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();

        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {//O(n)
            map.put(products.get(i), i); //O(log(n))
        }

        StringBuilder key = new StringBuilder(searchWord.substring(0,1));
        for (int i=1; i<searchWord.length(); i++) {//(O(s)
            key.append(searchWord.charAt(i));
            String ceiling = map.ceilingKey(key.toString());
            String floor = map.floorKey(key.toString() + "}");
            if (ceiling == null || floor == null) break;
            List<String> suggestedProducts = products.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1));
            result.add(suggestedProducts);
        }

        while (result.size() < searchWord.length()-1)
            result.add(new ArrayList<>());
        return result;
    }

    public static List<List<String>> suggestedProductsCaseInsensitive(List<String> products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TreeMap<Stringy, Integer> map = new TreeMap<Stringy, Integer>(new StringyComparator());

        Collections.sort(products, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < products.size(); i++) {//O(n)
            map.put(new Stringy(products.get(i), i), i); //O(log(n))
        }

        String key = searchWord.substring(0,1);
        for (int i=1; i<searchWord.length(); i++) {//(O(s)
            key += searchWord.charAt(i);
            Stringy ceiling = map.ceilingKey(new Stringy(key,i));
            Stringy floor = map.floorKey( new Stringy(key + "}",i));
            if (ceiling == null || floor == null) break;
            List<String> suggestedProducts = products.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1));
            result.add(suggestedProducts);
        }

        while (result.size() < searchWord.length()-1)
            result.add(new ArrayList<>());
        return result;
    }

    public static class Stringy{
        String str;
        int index;

        public Stringy(String str, int index){
            this.str = str;
            this.index = index;
        }
    }

    public static class StringyComparator implements Comparator<Stringy>{
        @Override
        public int compare(Stringy o1, Stringy o2) {
            if(o1.index < o2.index){
                return -1;
            }else if(o1.index > o2.index){
                return 1;
            }else{
                return 0;
            }
        }
    }

}
