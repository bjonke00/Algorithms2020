package com.algorithmpractice.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AutoComplete {

    //time O(n*m) | space O(n)
    public static List<String> autoComplete(List<String> sampleSet, String str){
        List<String> output = new ArrayList();
        for(String s : sampleSet){
            if(s.contains(str)){
                output.add(s);
            }
        }
        return output;
    }

    //try using trie

    @Test
    public void testAutoComplete(){
        List<String> sampleSet = Arrays.asList(new String[]{"dog", "dark", "cat", "door", "dodge"});
        String input = "do";
        List<String> expected = Arrays.asList(new String[]{"dog", "door", "dodge"});
        assertEquals(expected, autoComplete(sampleSet, input));
    }
}
