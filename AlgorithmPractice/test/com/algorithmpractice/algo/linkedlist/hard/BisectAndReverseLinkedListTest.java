package com.algorithmpractice.algo.linkedlist.hard;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BisectAndReverseLinkedListTest {

    @Test
    public void TestCase_even() {
        BisectAndReverseLinkedList.LinkedList test = addMany(new BisectAndReverseLinkedList.LinkedList(0), new int[] {1, 2, 3, 4, 5});
        List<Integer> result = getNodesInArray(BisectAndReverseLinkedList.invertedBisection(test));
        List<Integer> expected = getNodesInArray(addMany(new BisectAndReverseLinkedList.LinkedList(2), new int[] {1, 0, 5, 4, 3}));
        assertTrue(result.equals(expected));
    }

    @Test
    public void TestCase_odd() {
        BisectAndReverseLinkedList.LinkedList test = addMany(new BisectAndReverseLinkedList.LinkedList(0), new int[] {1, 2, 3, 4, 5, 6});
        List<Integer> result = getNodesInArray(BisectAndReverseLinkedList.invertedBisection(test));
        List<Integer> expected = getNodesInArray(addMany(new BisectAndReverseLinkedList.LinkedList(2), new int[] {1, 0, 3, 6, 5, 4}));
        assertTrue(result.equals(expected));
    }

    public BisectAndReverseLinkedList.LinkedList addMany(BisectAndReverseLinkedList.LinkedList linkedList, int[] values) {
        BisectAndReverseLinkedList.LinkedList current = linkedList;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new BisectAndReverseLinkedList.LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public List<Integer> getNodesInArray(BisectAndReverseLinkedList.LinkedList linkedList) {
        List<Integer> nodes = new ArrayList<Integer>();
        BisectAndReverseLinkedList.LinkedList current = linkedList;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }
}