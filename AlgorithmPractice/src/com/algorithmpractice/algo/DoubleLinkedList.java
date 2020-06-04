package com.algorithmpractice.algo;

public class DoubleLinkedList {
	static class DoublyLinkedList {
		public Node head;
		public Node tail;

		public void setHead(Node node) {
			if (head == null) {
				head = node;
				tail = node;
			} else {
				insertBefore(head, node);
			}
		}

		public void setTail(Node node) {
			if (tail == null) {
				setHead(node);
				return;
			} else {
				insertAfter(tail, node);
			}
		}

		public void insertBefore(Node node, Node nodeToInsert) {
			if (node == head) {
				nodeToInsert.next = head;
				head.prev = nodeToInsert;
				head = nodeToInsert;
			} else {
				nodeToInsert.prev = node.prev;
				nodeToInsert.next = node;
				node.prev.next = nodeToInsert;
				node.prev = nodeToInsert;
			}
		}

		public void insertAfter(Node node, Node nodeToInsert) {
			if (node == tail) {
				nodeToInsert.prev = tail;
				tail.next = nodeToInsert;
				tail = nodeToInsert;
			} else {
				nodeToInsert.next = node.next;
				nodeToInsert.prev = node;
				node.next.prev = nodeToInsert;
				node.next = nodeToInsert;
			}
		}

		public void insertAtPosition(int position, Node nodeToInsert) {
			if (position == 1) {
				setHead(nodeToInsert);
				return;
			}
			Node node = head;
			int c = 1;
			while (node != null && c++ != position) {
				node = node.next;
			}
			if (node != null) {
				insertBefore(node, nodeToInsert);
			} else {
				setTail(nodeToInsert);
			}
		}

		public void removeNodesWithValue(int value) {
			Node node = head;
			while (node != null) {
				if (node.value == value) {
					remove(node);
				}
				node = node.next;
			}
		}

		public void remove(Node node) {
			if (head == node) {
				head = head.next;
				head.prev.next = null;
				head.prev = null;
			} else if (tail == node) {
				tail = tail.prev;
				tail.next.prev = null;
				tail.next = null;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
				node.next = null;
				node.prev = null;
			}
		}

		public boolean containsNodeWithValue(int value) {
			Node node = head;
			while (node != null) {
				if (node.value == value)
					return true;
				node = node.next;
			}
			return false;
		}

	}

	// Do not edit the class below.
	static class Node {
		public int value;
		public Node prev;
		public Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);

		DoublyLinkedList dl = new DoublyLinkedList();
		dl.setHead(c);
		dl.setHead(b);
		dl.setHead(a);
		dl.setTail(d);
		dl.insertAtPosition(1, d);

		Node node = dl.head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}

	}

}
