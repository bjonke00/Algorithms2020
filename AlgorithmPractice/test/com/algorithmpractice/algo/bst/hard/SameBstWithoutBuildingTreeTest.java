package com.algorithmpractice.algo.bst.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SameBstWithoutBuildingTreeTest {

    @Test
    public void TestCase1() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));
        assertTrue(SameBstWithoutBuildingTree.sameBsts(arrayOne, arrayTwo) == true);
    }
}