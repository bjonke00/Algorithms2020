package com.algorithmpractice.algo.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ClassPhotos {
    //time : O(nlog(n))
    //space : O(1)
    public boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort((a,b) -> b - a);
        blueShirtHeights.sort((a,b) -> b - a);
        if(redShirtHeights.get(0) < blueShirtHeights.get(0)){
            for(int i = 0; i < redShirtHeights.size(); i++){
                if(redShirtHeights.get(i) >= blueShirtHeights.get(i))
                    return false;
            }
        }else{
            for(int i = 0; i < redShirtHeights.size(); i++){
                if(redShirtHeights.get(i) <= blueShirtHeights.get(i))
                    return false;
            }
        }

        return true;
    }

    @Test
    public void testOneListIsAllGreater() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotAllGreater() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(6));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6));
        boolean expected = false;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertEquals(expected, actual);
    }
}
