package com.algorithmpractice.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Rabinkarp {

    @Test
    public void test(){
        List<Integer> expected = List.of(0,5);
        String subString = "BRB";
        String text = "BRBISBRBNIBABO";
        List<Integer> output = findSubs(subString, text);
        assertTrue(output != null && expected.size() == output.size());
        for(int i = 0; i < expected.size(); i++){
            assertTrue(output.get(i) == expected.get(i));
        }
    }

    private List<Integer> findSubs(String subString, String text) {
        List<Integer> output = new ArrayList<>();

        int hash = subString.hashCode();
        for(int i = 0; i < text.length() - subString.length() + 1; i++){
            if(text.substring(i, i + subString.length()).hashCode() == hash){
                output.add(i);
            }
        }

        return output;
    }
}
