package com.algorithmpractice.algo.graph.extreme;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AirportConnectionsTest {

    List<String> AIRPORTS =
            new ArrayList<String>(
                    Arrays.asList(
                            "BGI", "CDG", "DEL", "DOH", "DSM", "EWR", "EYW", "HND", "ICN", "JFK", "LGA", "LHR",
                            "ORD", "SAN", "SFO", "SIN", "TLV", "BUD"));

    String STARTING_AIRPORT = "LGA";

//    @Test TODO:revisit algorithm
    public void TestCase1() {
        List<List<String>> routes = new ArrayList<List<String>>();
        routes.add(new ArrayList<String>(Arrays.asList("DSM", "ORD")));
        routes.add(new ArrayList<String>(Arrays.asList("ORD", "BGI")));
        routes.add(new ArrayList<String>(Arrays.asList("BGI", "LGA")));
        routes.add(new ArrayList<String>(Arrays.asList("SIN", "CDG")));
        routes.add(new ArrayList<String>(Arrays.asList("CDG", "SIN")));
        routes.add(new ArrayList<String>(Arrays.asList("CDG", "BUD")));
        routes.add(new ArrayList<String>(Arrays.asList("DEL", "DOH")));
        routes.add(new ArrayList<String>(Arrays.asList("DEL", "CDG")));
        routes.add(new ArrayList<String>(Arrays.asList("TLV", "DEL")));
        routes.add(new ArrayList<String>(Arrays.asList("EWR", "HND")));
        routes.add(new ArrayList<String>(Arrays.asList("HND", "ICN")));
        routes.add(new ArrayList<String>(Arrays.asList("HND", "JFK")));
        routes.add(new ArrayList<String>(Arrays.asList("ICN", "JFK")));
        routes.add(new ArrayList<String>(Arrays.asList("JFK", "LGA")));
        routes.add(new ArrayList<String>(Arrays.asList("EYW", "LHR")));
        routes.add(new ArrayList<String>(Arrays.asList("LHR", "SFO")));
        routes.add(new ArrayList<String>(Arrays.asList("SFO", "SAN")));
        routes.add(new ArrayList<String>(Arrays.asList("SFO", "DSM")));
        routes.add(new ArrayList<String>(Arrays.asList("SAN", "EYW")));
        assertTrue(AirportConnections.airportConnections(AIRPORTS, routes, STARTING_AIRPORT) == 3);
    }
}