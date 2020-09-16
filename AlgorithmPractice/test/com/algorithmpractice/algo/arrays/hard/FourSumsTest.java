package com.algorithmpractice.algo.arrays.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FourSumsTest {

    private boolean compare(List<Integer[]> quads1, List<Integer[]> quads2) {
        for (Integer[] quad : quads2) {
            Arrays.sort(quad);
        }
        for (Integer[] quad : quads1) {
            Arrays.sort(quad);
        }
        for (Integer[] quad2 : quads2) {
            boolean found = false;
            for (Integer[] quad1 : quads1) {
                if (Arrays.equals(quad2, quad1)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        List<Integer[]> output1 = FourSums.fourNumberSum(new int[] {7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> output2 = FourSums.fourNumberSum_bruteforce(new int[] {7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {7, 6, 4, -1});
        quadruplets.add(new Integer[] {7, 6, 1, 2});
        assertTrue(quadruplets.size() == output1.size());
        assertTrue(quadruplets.size() == output2.size());
        assertTrue(this.compare(quadruplets, output1));
        assertTrue(this.compare(quadruplets, output2));
    }
}