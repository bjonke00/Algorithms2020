package com.algorithmpractice.algo.linkedlist.hard;

public class BisectAndReverseLinkedList {
    //O(n) time O(1) space
    //try this .. count the nodes, split the ll, reverse the ll, reattach

    //O(n) time O(1) space
    //reverse ll,
    //for even point the tail of rll to the head of rll
    //for odd point the tail of rll to the mid and the mid to the head of rll
    //point the node before the mid to null
    public static LinkedList invertedBisection(LinkedList head) {
        //set tail as head
        LinkedList tail = head;

        //reverse ll
        LinkedList p1 = null;
        LinkedList p2 = head;
        LinkedList p3 = head.next;
        if(p2 == null || p3 == null || p3.next == null || p3.next.next == null)
            return head;
        int count = 0;
        while(p2 != null){
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if(p3 != null)
                p3 = p3.next;
            count++;
        }
        head = p1;

        int midpoint = count / 2;
        //point to new head
        if(count % 2 == 0){
            LinkedList mid = head;
            tail.next = head;
            while(midpoint > 1){
                mid = mid.next;
                midpoint--;
            }
            head = mid.next;
            mid.next = null;
        }else{
            LinkedList temp = head;
            LinkedList mid = null;
            LinkedList beforeMid = null;
            while(midpoint >= 0){
                if(midpoint == 0){
                    mid = head;
                }
                if(midpoint == 1){
                    beforeMid = head;
                    head = head.next;
                    beforeMid.next = null;
                }else{
                    head = head.next;
                }
                midpoint--;
            }
            tail.next = mid;
            mid.next = temp;
        }

        return head;
    }

    // This is an input class. Do not edit.
    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
