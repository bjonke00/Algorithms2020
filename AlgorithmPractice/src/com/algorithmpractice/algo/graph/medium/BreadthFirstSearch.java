package com.algorithmpractice.algo.graph.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

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

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}
	}

	public static void main(String[] args) {
		Node n = new Node("A");
		n.addChild("B").addChild("C").addChild("D");
		n.children.get(0).addChild("E").addChild("F");
		n.children.get(2).addChild("G").addChild("H");
		n.children.get(0).children.get(1).addChild("I").addChild("J");
		n.children.get(2).children.get(0).addChild("K");
		List<String> a = n.breadthFirstSearch(new ArrayList<String>());
		a.forEach(i -> System.out.println(i));
	}
}
