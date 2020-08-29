package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PermutationsTest {

    private Permutations permutations;

    @Before
    public void setup(){
        permutations = new Permutations();
    }

    @Test
    public void TestCase1() {

        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = permutations.getPermutations(input);
        assertTrue(perms.size() == 6);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));

        List<List<Integer>> perms1 = permutations.getPermutations1(input);
        assertTrue(perms1.size() == 6);
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
        assertTrue(contains(perms1, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
    }

    public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
        for (List<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}