package com.algorithmpractice.algo.graph.hard;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DijkstraShortestPathTest {

    DijkstraShortestPath dsp;
    Set<DijkstraShortestPath.Node> graph;
    DijkstraShortestPath.Node home;
    DijkstraShortestPath.Node deli;
    DijkstraShortestPath.Node school;
    DijkstraShortestPath.Node pizzeria;
    DijkstraShortestPath.Node park;

    /*
    home - 1 - deli
    |             |
    1             3
    |             |
    school - 1 - pizzeria
    |             |
    4             1
    |-------park--|
    */
    @Before
    public void setup(){
        dsp = new DijkstraShortestPath();
        graph = new HashSet<>();
        home = new DijkstraShortestPath.Node("home");
        deli = new DijkstraShortestPath.Node("deli");
        school = new DijkstraShortestPath.Node("school");
        pizzeria = new DijkstraShortestPath.Node("pizzeria");
        park = new DijkstraShortestPath.Node("park");

        Map<DijkstraShortestPath.Node, Integer> homeChildren = new HashMap();
        homeChildren.put(deli, 1);
        homeChildren.put(school, 1);
        home.setChildren(homeChildren);
        graph.add(home);

        Map<DijkstraShortestPath.Node, Integer> deliChildren = new HashMap();
        deliChildren.put(home, 1);
        deliChildren.put(pizzeria, 3);
        deli.setChildren(deliChildren);
        graph.add(deli);

        Map<DijkstraShortestPath.Node, Integer> schoolChildren = new HashMap();
        schoolChildren.put(home, 1);
        schoolChildren.put(pizzeria, 1);
        schoolChildren.put(park, 4);
        school.setChildren(schoolChildren);
        graph.add(school);

        Map<DijkstraShortestPath.Node, Integer> pizzeriaChildren = new HashMap();
        pizzeriaChildren.put(deli, 3);
        pizzeriaChildren.put(school, 1);
        pizzeriaChildren.put(park, 1);
        pizzeria.setChildren(pizzeriaChildren);
        graph.add(pizzeria);

        Map<DijkstraShortestPath.Node, Integer> parkChildren = new HashMap();
        parkChildren.put(school, 4);
        parkChildren.put(pizzeria, 1);
        park.setChildren(parkChildren);
        graph.add(park);
    }


    @Test
    public void testShortestPath_home_to_school(){
        assertEquals(1, dsp.findShortestPath(graph, home, school));
    }

    @Test
    public void testShortestPath_home_to_pizzeria(){
        assertEquals(2, dsp.findShortestPath(graph, home, pizzeria));
    }

    @Test
    public void testShortestPath_home_to_park(){
        assertEquals(3, dsp.findShortestPath(graph, home, pizzeria));
    }

    @Test
    public void testShortestPath_school_to_park(){
        assertEquals(2, dsp.findShortestPath(graph, home, pizzeria));
    }

    @Test
    public void testShortestPath_school_to_pizzeria(){
        assertEquals(1, dsp.findShortestPath(graph, home, pizzeria));
    }

    @Test
    public void testShortestPath_school_to_deli() {
        assertEquals(2, dsp.findShortestPath(graph, home, pizzeria));
    }

}