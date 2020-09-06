package com.algorithmpractice.algo.medium;

import org.junit.Assume;

import java.util.LinkedList;

public class RemoveKthFromEndLinkedList {

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    //time O(n) | space O(1)
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int count = 0;
        LinkedList first = head;
        LinkedList second = head;
        while (count < k) {
            second = second.next;
            count++;
        }
        if (second == null) {
            //k is the length of the linkedList
            //so we must remove the head
            head.value = head.next.value;
            head.next = head.next.next;
            return;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        //first is one before the node to remove
        first.next = first.next.next;
    }

    public static void removeKthNodeFromEndOfLinkedList_FirstAttempt(LinkedList head, int k) {
        int count = 0;
        LinkedList currPointer = head;
        while (currPointer != null) {
            currPointer = currPointer.next;
            count++;
        }
        //count is the size of the linked list
        //kFront is length from the front of the l.l.
        int kFront = count - k;
        currPointer = head;
        while (kFront > 1) {
            currPointer = currPointer.next;
            kFront--;
        }
        //currPointer is one before removal node
        if (currPointer == head && kFront == 0) {
            head.value = currPointer.next.value;
            head.next = currPointer.next.next;
        } else {
            currPointer.next = currPointer.next.next;
        }
    }

}
