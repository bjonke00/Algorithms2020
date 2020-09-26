package com.algorithmpractice.algo.linkedlist.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeLinkedListTest {
    public MergeLinkedList.LinkedList addMany(MergeLinkedList.LinkedList ll, List<Integer> values) {
        MergeLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new MergeLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(MergeLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        MergeLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    public void TestCase1() {
        MergeLinkedList.LinkedList list1 = new MergeLinkedList.LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        MergeLinkedList.LinkedList list2 = new MergeLinkedList.LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        MergeLinkedList.LinkedList output = MergeLinkedList.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}