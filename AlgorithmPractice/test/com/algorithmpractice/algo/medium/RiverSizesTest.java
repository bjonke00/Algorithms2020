package com.algorithmpractice.algo.medium;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class RiverSizesTest {

    @Test
    public void TestCase1() {
        RiverSizes rs = new RiverSizes();
        int[][] input = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
        };
        int[] expected = {1, 2, 2, 2, 5};
        List<Integer> output = rs.riverSizes(input);
        Collections.sort(output);
        assertTrue(compare(output, expected));
    }

    public static boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}