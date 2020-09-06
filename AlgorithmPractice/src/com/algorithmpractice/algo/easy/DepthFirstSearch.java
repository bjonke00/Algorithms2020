package com.algorithmpractice.algo.easy;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {
	//Time O(e + v) | space O(v)
	static class Node {
		String name;
		List<Node> children = new ArrayList<Node>();

		public Node(String name) {
			this.name = name;
		}

		public List<String> depthFirstSearch(List<String> array) {
			array.add(this.name);
			this.children.forEach(child->child.depthFirstSearch(array));
			return array;
		}

		public Node addChild(String name) {
			Node child = new Node(name);
			children.add(child);
			return this;
		}
	}

	public static void main(String[] args) {
		Node n = new Node("a");
		n.addChild("b");
		n.addChild("d");
		n.children.get(0).addChild("c");
		List<String> a = n.depthFirstSearch(new ArrayList<String>());
		a.forEach(i->System.out.println(i));
	}
}
