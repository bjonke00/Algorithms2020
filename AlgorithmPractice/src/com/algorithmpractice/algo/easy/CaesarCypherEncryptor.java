package com.algorithmpractice.algo.easy;

public class CaesarCypherEncryptor {
    //O(n) time and space
    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder answer = new StringBuilder();
        int smallestKey = key % 26;
        for(int i=0; i<str.length(); i++){
            int letterCode = str.charAt(i)+smallestKey;
            if(letterCode>122)
                letterCode=96 + letterCode % 122;
            answer.append((char)letterCode);
        }
        return answer.toString();
    }
}
