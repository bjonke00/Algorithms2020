package com.algorithmpractice.algo.binarytree.hard;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LowestCommonManagerTest {
    public Map<Character, LowestCommonManager.OrgChart> getOrgCharts() {
        Map<Character, LowestCommonManager.OrgChart> orgCharts = new HashMap<Character, LowestCommonManager.OrgChart>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char a : alphabet.toCharArray()) {
            orgCharts.put(a, new LowestCommonManager.OrgChart(a));
        }
        orgCharts.get('X').addDirectReports(new LowestCommonManager.OrgChart[] {orgCharts.get('Z')});
        return orgCharts;
    }

    @Test
    public void TestCase1() {
        Map<Character, LowestCommonManager.OrgChart> orgCharts = getOrgCharts();
        orgCharts
                .get('A')
                .addDirectReports(new LowestCommonManager.OrgChart[] {orgCharts.get('B'), orgCharts.get('C')});
        orgCharts
                .get('B')
                .addDirectReports(new LowestCommonManager.OrgChart[] {orgCharts.get('D'), orgCharts.get('E')});
        orgCharts
                .get('C')
                .addDirectReports(new LowestCommonManager.OrgChart[] {orgCharts.get('F'), orgCharts.get('G')});
        orgCharts
                .get('D')
                .addDirectReports(new LowestCommonManager.OrgChart[] {orgCharts.get('H'), orgCharts.get('I')});

        LowestCommonManager.OrgChart lcm =
                LowestCommonManager.getLowestCommonManager(orgCharts.get('A'), orgCharts.get('E'), orgCharts.get('I'));
        assertTrue(lcm == orgCharts.get('B'));
    }
}