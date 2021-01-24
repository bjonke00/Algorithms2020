package com.algorithmpractice.algo.graph.hard;

import java.util.*;

public class DijkstraShortestPath {

    public static class Node{
        String value;
        Map<Node, Integer> children;
        Integer shortestPath = Integer.MAX_VALUE;
        Node previousNode;

        public Node(String value){
            this.value = value;
        }

        public Node(String value, Map<Node, Integer> children){
            this.value = value;
            this.children = children;
        }

        public void setChildren(Map<Node, Integer> children){
            this.children = children;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(value, node.value) &&
                    Objects.equals(children, node.children);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, children);
        }
    }

    public int findShortestPath(Set<Node> graph, Node start, Node end){
        Set<Node> visited = new HashSet();

        start.shortestPath = 0;

        PriorityQueue<Node> queue = new PriorityQueue(new ShortestPathComparator());
        queue.add(start);
        while(!queue.isEmpty()){
            Node currentNode = queue.poll();

            if(visited.contains(currentNode)){
                continue;
            }

            for(Node childNode : currentNode.children.keySet()){
                Integer currentToChild = currentNode.children.get(childNode);
                if(currentToChild +  currentNode.shortestPath < childNode.shortestPath){
                    childNode.shortestPath = currentToChild + currentNode.shortestPath;
                    childNode.previousNode = currentNode;
                }
                queue.add(childNode);
            }

            visited.add(currentNode);
        }


        return 0;
    }

    public class ShortestPathComparator implements Comparator<Node>{
        public int compare(Node a, Node b){
            if(a.shortestPath < b.shortestPath){
                return -1;
            }else if(a.shortestPath > b.shortestPath){
                return 1;
            }
            return 0;
        }
    }
}

/*
Set<Node> visited = new HashSet(); //A,C,D,E,B
     A - 2 - B ---
     |       |    |
     1       3    1
     |       |    |
     C - 3 - D -2-E
Nodes shortestPath previousNode
B      2            A
C      1            A
D      4            C
E      3            B
 */