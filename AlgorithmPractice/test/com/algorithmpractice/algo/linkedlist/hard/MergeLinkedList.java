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

}
