package com.algorithmpractice;

public class ReverseLinkedList {
	//O(n) time and o(1) space
	public static LinkedList reverseLinkedList(LinkedList head) {
		LinkedList p1 = null;
		LinkedList p2 = head;

		while (p2 != null) {
			LinkedList p3 = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p3;
		}

		return p1;
	}

	static class LinkedList {
		int value;
		LinkedList next = null;

		public LinkedList(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		LinkedList ll = newLinkedList(new int[] { 0, 1, 2, 3 });
		LinkedList ll2 = reverseLinkedList(ll);
		for (int i = 0; i < 3; i++) {
			System.out.print(ll2.value);
			ll2 = ll2.next;
			System.out.println("->" + ll2.value);
		}
	}

	public static LinkedList newLinkedList(int[] values) {
		LinkedList ll = new LinkedList(values[0]);
		LinkedList current = ll;
		for (int i = 1; i < values.length; i++) {
			current.next = new LinkedList(values[i]);
			current = current.next;
		}
		return ll;
	}
}
