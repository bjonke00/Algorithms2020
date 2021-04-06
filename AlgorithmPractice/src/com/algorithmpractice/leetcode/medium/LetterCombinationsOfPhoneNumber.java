package com.algorithmpractice.leetcode.medium;

import java.util.*;

class LetterCombinationsOfPhoneNumber {
    // O(4^N) time and space where N is the length of the phone number
    // the 4^N is since worst case there are 4 possible letter for 7 & 9
    //consider :
    /*
        0 1 2 3 4
              a          b       c
         d    e    f   d e f   d e f
        ghi  ghi  ghi  ....  .......  3^N = 3^3 = 27
     */
    static Map<Character, String[]> NUM_TO_LETTER = new HashMap();
    static{
        NUM_TO_LETTER.put('0', new String[]{"0"});
        NUM_TO_LETTER.put('1', new String[]{"1"});
        NUM_TO_LETTER.put('2', new String[]{"a","b","c"});
        NUM_TO_LETTER.put('3', new String[]{"d","e","f"});
        NUM_TO_LETTER.put('4', new String[]{"g","h","i"});
        NUM_TO_LETTER.put('5', new String[]{"j","k","l"});
        NUM_TO_LETTER.put('6', new String[]{"m","n","o"});
        NUM_TO_LETTER.put('7', new String[]{"p","q","r","s"});
        NUM_TO_LETTER.put('8', new String[]{"t","u","v"});
        NUM_TO_LETTER.put('9', new String[]{"w","x","z","y"});
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList();
        }

        StringBuilder text = new StringBuilder();
        List<String> textsFound = new ArrayList();
        populateTextsFound(0, text, textsFound, digits);

        return textsFound;
    }

    private void populateTextsFound(int idx, StringBuilder text, List<String> textsFound, String digits){
        if(idx == digits.length()){
            textsFound.add(text.toString());
        }else{
            String[] letters = NUM_TO_LETTER.get(digits.charAt(idx));
            for(String letter : letters){
                text.replace(idx, idx + 1, letter);
                populateTextsFound(idx + 1, text, textsFound, digits);
            }
        }
    }
}