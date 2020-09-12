package com.algorithmpractice.algo.graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    //O(v+e) time and O(v) space
    public List<String> breadthFirstSearch(List<String> array) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            array.add(currentNode.name);
            currentNode.children.forEach(child -> queue.add(child));
        }

        return array;
    }

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
