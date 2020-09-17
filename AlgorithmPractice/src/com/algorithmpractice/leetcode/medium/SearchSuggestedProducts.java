package com.algorithmpractice.leetcode.medium;

import java.io.*;
import java.sql.Connection;
import java.util.*;
import java.util.stream.IntStream;

public class SearchSuggestedProducts {

    public static List<List<String>> suggestedProducts(List<String> products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        Collections.sort(products); //O(nlog(n))

        for (int i = 0; i < products.size(); i++) {//O(n)
            map.put(products.get(i), i); //O(log(n))
        }

        StringBuilder key = new StringBuilder();
        for (int i=0; i<searchWord.length(); i++) {//(O(s)
            key.append(searchWord.charAt(i));
            String ceiling = map.ceilingKey(key.toString());
            String floor = map.floorKey(key.toString() + "}");
            if (ceiling == null || floor == null) break;
            List<String> suggestedProducts = products.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1));
            result.add(suggestedProducts);
        }

        while (result.size() < searchWord.length())
            result.add(new ArrayList<>());
        return result;
    }

}
