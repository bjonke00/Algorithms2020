package com.algorithmpractice.leetcode.linkedlist.medium;

import java.util.HashMap;
import java.util.Map;

public class CopyLinkedListWithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //O(n) time and O(n) space
    public Node copyRandomListUsingCache(Node head) {
        Map<Node, Node> cache = new HashMap();
        Node current = head;
        Node newHead = null;
        while(current != null){
            if(current == head){
                newHead = new Node(current.val);
                cache.put(current, newHead);
            }else{
                Node newNode = new Node(current.val);
                cache.put(current, newNode);
            }
            current = current.next;
        }

        current = head;
        Node copy = null;
        while(current != null){
            copy = cache.get(current);
            copy.next = cache.get(current.next);
            copy.random = cache.get(current.random);
            current = current.next;
            copy = copy.next;
        }

        return newHead;
    }

    //O(n) time and O(1) space
    public Node copyRandomList(Node head) {
        Node curr = head;
        Node temp = null;

        // interlink the original list to the new copies
        while (curr != null)
        {
            temp = curr.next;

            // Inserting node
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;
        // update randoms on copies
        while (curr != null)
        {
            if(curr.next != null)
                curr.next.random = (curr.random != null)
                        ? curr.random.next : curr.random;

            // move to the next newly added node by
            // skipping an original node
            curr = (curr.next != null) ? curr.next.next
                    : curr.next;
        }

        Node original = head;
        Node copy = head.next;
        temp = copy;
        //separate the original list and copied list
        while (original != null && copy != null)
        {
            original.next = (original.next != null)?
                    original.next.next : original.next;

            copy.next = (copy.next != null) ? copy.next.next
                    : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}
