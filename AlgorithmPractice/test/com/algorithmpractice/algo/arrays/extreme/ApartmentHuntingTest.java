package com.algorithmpractice.algo.arrays.extreme;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ApartmentHuntingTest {
    @Test
    public void TestCase1() {
        List<Map<String, Boolean>> blocks = new ArrayList<Map<String, Boolean>>();

        blocks.add(0, new HashMap<String, Boolean>());
        blocks.get(0).put("gym", false);
        blocks.get(0).put("school", true);
        blocks.get(0).put("store", false);

        blocks.add(1, new HashMap<String, Boolean>());
        blocks.get(1).put("gym", true);
        blocks.get(1).put("school", false);
        blocks.get(1).put("store", false);

        blocks.add(2, new HashMap<String, Boolean>());
        blocks.get(2).put("gym", true);
        blocks.get(2).put("school", true);
        blocks.get(2).put("store", false);

        blocks.add(3, new HashMap<String, Boolean>());
        blocks.get(3).put("gym", false);
        blocks.get(3).put("school", true);
        blocks.get(3).put("store", false);

        blocks.add(4, new HashMap<String, Boolean>());
        blocks.get(4).put("gym", false);
        blocks.get(4).put("school", true);
        blocks.get(4).put("store", true);

        String[] reqs = new String[] {"gym", "school", "store"};
        assertTrue(ApartmentHunting.apartmentHunting(blocks, reqs) == 3);
    }

    @Test
    public void TestCase2() {
        List<Map<String, Boolean>> blocks = new ArrayList<Map<String, Boolean>>();

        blocks.add(0, new HashMap<String, Boolean>());
        blocks.get(0).put("gym", true);
        blocks.get(0).put("office", false);
        blocks.get(0).put("pool", false);
        blocks.get(0).put("school", true);
        blocks.get(0).put("store", false);

        blocks.add(1, new HashMap<String, Boolean>());
        blocks.get(1).put("gym", false);
        blocks.get(1).put("office", false);
        blocks.get(1).put("pool", false);
        blocks.get(1).put("school", false);
        blocks.get(1).put("store", false);

        blocks.add(2, new HashMap<String, Boolean>());
        blocks.get(2).put("gym", false);
        blocks.get(0).put("office", true);
        blocks.get(2).put("pool", false);
        blocks.get(2).put("school", true);
        blocks.get(2).put("store", false);

        blocks.add(3, new HashMap<String, Boolean>());
        blocks.get(3).put("gym", false);
        blocks.get(0).put("office", true);
        blocks.get(3).put("pool", false);
        blocks.get(3).put("school", false);
        blocks.get(3).put("store", true);

        blocks.add(4, new HashMap<String, Boolean>());
        blocks.get(4).put("gym", true);
        blocks.get(0).put("office", false);
        blocks.get(4).put("pool", false);
        blocks.get(4).put("school", false);
        blocks.get(4).put("store", false);

        blocks.add(5, new HashMap<String, Boolean>());
        blocks.get(5).put("gym", false);
        blocks.get(0).put("office", true);
        blocks.get(5).put("pool", false);
        blocks.get(5).put("school", false);
        blocks.get(5).put("store", false);

        blocks.add(6, new HashMap<String, Boolean>());
        blocks.get(6).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(6).put("pool", true);
        blocks.get(6).put("school", false);
        blocks.get(6).put("store", false);

        blocks.add(7, new HashMap<String, Boolean>());
        blocks.get(7).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(7).put("pool", false);
        blocks.get(7).put("school", false);
        blocks.get(7).put("store", false);

        blocks.add(8, new HashMap<String, Boolean>());
        blocks.get(8).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(8).put("pool", false);
        blocks.get(8).put("school", false);
        blocks.get(8).put("store", false);

        blocks.add(9, new HashMap<String, Boolean>());
        blocks.get(9).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(9).put("pool", false);
        blocks.get(9).put("school", false);
        blocks.get(9).put("store", false);

        blocks.add(10, new HashMap<String, Boolean>());
        blocks.get(10).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(10).put("pool", false);
        blocks.get(10).put("school", true);
        blocks.get(10).put("store", false);

        blocks.add(11, new HashMap<String, Boolean>());
        blocks.get(11).put("gym", false);
        blocks.get(0).put("office", false);
        blocks.get(11).put("pool", false);
        blocks.get(11).put("school", true);
        blocks.get(11).put("store", false);

        String[] reqs = new String[] {"gym", "pool", "school", "store"};
        assertTrue(ApartmentHunting.apartmentHunting(blocks, reqs) == 4);
    }
}