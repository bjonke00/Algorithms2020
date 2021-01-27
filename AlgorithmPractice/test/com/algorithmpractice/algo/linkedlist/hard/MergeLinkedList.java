package com.algorithmpractice.algo.linkedlist.hard;

public class MergeLinkedList {
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    //time O(n+m) and space O(1)
    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        LinkedList currentOne = headOne;
        LinkedList previousOne = null;
        LinkedList currentTwo = headTwo;

        while (currentOne != null && currentTwo != null) {
            if (currentOne.value < currentTwo.value) {
                previousOne = currentOne;
                currentOne = currentOne.next;
            } else {
                if (previousOne != null)
                    previousOne.next = currentTwo;
                previousOne = currentTwo;
                currentTwo = currentTwo.next;
                previousOne.next = currentOne;
            }
        }

        if (currentOne == null)
            previousOne.next = currentTwo;

        return headOne.value < headTwo.value ? headOne : headTwo;
    }

    public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
        LinkedList head = new LinkedList(-1);
        LinkedList prev = head;
        while(l1 != null && l2 != null){
            if(l1.value < l2.value){
                prev.next = l1;
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        if(l1 == null){
            prev.next = l2;
        }else{
            prev.next = l1;
        }


        return head.next;
    }

}
