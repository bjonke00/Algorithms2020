package com.algorithmpractice.algo.hard;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortenPath {
    //O(n) time and space
    public static String shortenPath(String path) {
        boolean isRoot = path.charAt(0) == '/';
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String str : paths){
            //consider filtering these
            if(str.equals("") || str.equals(".") || (str.equals("..") && isRoot && stack.isEmpty())){
                continue;
            }

            if(str.equals("..") && !stack.isEmpty() && !stack.peek().equals("..")){
                stack.pop();
            }else{
                stack.push(str);
            }
        }

        StringBuilder finalPath = new StringBuilder(String.join("/", stack));

        if(isRoot){
            finalPath.insert(0, "/");
        }

        return finalPath.toString();
    }

    //O(n) time and space
//    public static String shortenPathf(String path) {
//        boolean isRoot = path.charAt(0) == '/';
//        String[] paths = path.split("/");
//        Stack<String> stack = new Stack<>();
//
//        List<String> pathsList = Arrays.asList(paths);
//        List<String> filteredPaths = pathsList.stream().filter(str -> isIgnorable(str)).collect(Collectors.toList());
//
//        for(String str : paths){
//            if((str.equals("..") && isRoot && stack.isEmpty())){
//                continue;
//            }
//
//            if(str.equals("..") && !stack.isEmpty() && !stack.peek().equals("..")){
//                stack.pop();
//            }else{
//                stack.push(str);
//            }
//        }
//
//        StringBuilder finalPath = new StringBuilder(String.join("/", stack));
//
//        if(isRoot){
//            finalPath.insert(0, "/");
//        }
//
//        return finalPath.toString();
//    }
//
//    private static boolean isIgnorable(String str) {
//        return str.equals("") || str.equals(".");
//    }
}
