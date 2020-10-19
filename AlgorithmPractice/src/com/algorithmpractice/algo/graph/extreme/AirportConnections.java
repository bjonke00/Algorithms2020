package com.algorithmpractice.algo.graph.extreme;

import java.util.*;

public class AirportConnections {
    //O(a*(a+r)+a+r+alog(a)) time | O(a+r) space
    public static int airportConnections(
            List<String> airports, List<List<String>> routes, String startingAirport) {
        AirportGraph airportGraph = new AirportGraph(airports, routes);
        List<AirportNode> unreachableAirportNodes = getUnreachableAirportNodes(airportGraph, airports, startingAirport);
        updateUnreachableConnections(airportGraph, unreachableAirportNodes);
        return getMinNumOfNewConnections(airportGraph, unreachableAirportNodes);
    }

    //O(a+r) time | O(a+r) space
    public static class AirportGraph {
        Map<String, AirportNode> airportNodes = new HashMap<>();

        public AirportGraph(List<String> airports, List<List<String>> routes) {
            //create airport nodes
            for (String airport : airports) {
                airportNodes.put(airport, new AirportNode(airport));
            }
            //add connections to airport nodes
            for (List<String> route : routes) {
                AirportNode node = airportNodes.get(route.get(0));
                node.connections.add(route.get(1));
            }
        }
    }

    //O(a+r) time | O(a) space
    public static List<AirportNode> getUnreachableAirportNodes(AirportGraph airportGraph, List<String> airports, String startingAirport) {
        Set<String> visitedAirports = new HashSet<>();
        dfsTraverseAirports(airportGraph, startingAirport, visitedAirports);

        List<AirportNode> unreachableAirportNodes = new ArrayList<>();
        for (String airport : airports) {
            if (visitedAirports.contains(airport)) continue;
            AirportNode node = airportGraph.airportNodes.get(airport);
            node.isReachable = false;
            unreachableAirportNodes.add(node);
        }
        return unreachableAirportNodes;
    }

    //O(v+e) time | O(d) space
    public static void dfsTraverseAirports(AirportGraph airportGraph, String airport, Set<String> visitedAirports) {
        if (visitedAirports.contains(airport)) return;
        visitedAirports.add(airport);
        List<String> connections = airportGraph.airportNodes.get(airport).connections;
        for (String connection : connections) {
            dfsTraverseAirports(airportGraph, connection, visitedAirports);
        }
    }

    //O(a*a+r) time | O(a) space
    public static void updateUnreachableConnections(AirportGraph airportGraph, List<AirportNode> unreachableAirports) {
        for (AirportNode airportNode : unreachableAirports) {
            String airport = airportNode.name;
            List<String> unreachableConnections = new ArrayList<>();
            Set<String> visited = new HashSet<>();
            dfsAddUnreachableConnections(airportGraph, airport, unreachableConnections, visited);
            airportNode.unreachableConnections = unreachableConnections;
        }
    }

    //O(v+e) time | O(d) space
    public static void dfsAddUnreachableConnections(AirportGraph airportGraph, String airport, List<String> unreachableConnections, Set<String> visited) {
        if (airportGraph.airportNodes.get(airport).isReachable) return;
        if (visited.contains(airport)) return;
        visited.add(airport);
        unreachableConnections.add(airport);
        List<String> connections = airportGraph.airportNodes.get(airport).connections;
        for (String connection : connections) {
            dfsAddUnreachableConnections(airportGraph, connection, unreachableConnections, visited);
        }
    }

    //O(alog(a)+a+r) time | O(1) space
    public static int getMinNumOfNewConnections(AirportGraph airportGraph, List<AirportNode> unreachableAirportNodes) {
        unreachableAirportNodes.sort(new AirportComparator());
        unreachableAirportNodes.forEach(i -> System.out.println(i.name + " : " + i.unreachableConnections));
        int newConnectionCount = 0;
        for (AirportNode node : unreachableAirportNodes) {
            if (node.isReachable) continue;
            newConnectionCount++;
            for (String connection : node.unreachableConnections) {
                airportGraph.airportNodes.get(connection).isReachable = true;
            }
        }
        return newConnectionCount;
    }

    public static class AirportComparator implements Comparator<AirportNode> {
        public int compare(AirportNode a, AirportNode b) {
            int sizeA = a.unreachableConnections.size();
            int sizeB = b.unreachableConnections.size();
            if (sizeA > sizeB) {
                return -1;
            } else if (sizeA < sizeB) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static class AirportNode {
        String name;
        List<String> connections = new ArrayList<>();
        boolean isReachable = false;
        List<String> unreachableConnections = new ArrayList<>();

        public AirportNode(String name) {
            this.name = name;
        }

    }
}
