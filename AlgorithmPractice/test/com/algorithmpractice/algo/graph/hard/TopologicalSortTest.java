package com.algorithmpractice.algo.graph.hard;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TopologicalSortTest {
    @Test
    public void TestCase1() {
        List<Integer> jobs = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        Integer[][] depsArray = new Integer[][] {{1, 2}, {1, 3}, {3, 2}, {4, 2}, {4, 3}};
        List<Integer[]> deps = new ArrayList<Integer[]>();
        fillDeps(depsArray, deps);
        List<Integer> order = TopologicalSort.topologicalSort(jobs, deps);
        assertTrue(isValidTopologicalOrder(order, jobs, deps) == true);
    }

    @Test
    public void TestCase1_CyclicDependency() {
        List<Integer> jobs = new ArrayList<Integer>(Arrays.asList(1, 2));
        Integer[][] depsArray = new Integer[][] {{1, 2}, {2,1}};
        List<Integer[]> deps = new ArrayList<Integer[]>();
        fillDeps(depsArray, deps);
        List<Integer> order = TopologicalSort.topologicalSort(jobs, deps);
        assertTrue(isValidTopologicalOrder(order, jobs, deps) == false);
    }

    void fillDeps(Integer[][] depsArray, List<Integer[]> deps) {
        for (Integer[] depArray : depsArray) {
            deps.add(depArray);
        }
    }

    boolean isValidTopologicalOrder(List<Integer> order, List<Integer> jobs, List<Integer[]> deps) {
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        for (Integer candidate : order) {
            for (Integer[] dep : deps) {
                if (candidate == dep[0] && visited.containsKey(dep[1])) return false;
            }
            visited.put(candidate, true);
        }
        for (Integer job : jobs) {
            if (!visited.containsKey(job)) return false;
        }
        return order.size() == jobs.size();
    }

}