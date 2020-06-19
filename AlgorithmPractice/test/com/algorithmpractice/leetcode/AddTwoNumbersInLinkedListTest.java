package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddTwoNumbersInLinkedListTest {

    private AddTwoNumbersInLinkedList addTwoNumbersInLinkedList;

    @Before
    public void setup(){
        addTwoNumbersInLinkedList = new AddTwoNumbersInLinkedList();
    }

//    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//    Output: 7 -> 0 -> 8
//    Explanation: 342 + 465 = 807.
    @Test
    public void test(){
        AddTwoNumbersInLinkedList.ListNode l13 = new AddTwoNumbersInLinkedList.ListNode(3);
        AddTwoNumbersInLinkedList.ListNode l12 = new AddTwoNumbersInLinkedList.ListNode(4, l13);
        AddTwoNumbersInLinkedList.ListNode l1 = new AddTwoNumbersInLinkedList.ListNode(2, l12);

        AddTwoNumbersInLinkedList.ListNode l23 = new AddTwoNumbersInLinkedList.ListNode(4);
        AddTwoNumbersInLinkedList.ListNode l22 = new AddTwoNumbersInLinkedList.ListNode(6, l23);
        AddTwoNumbersInLinkedList.ListNode l2 = new AddTwoNumbersInLinkedList.ListNode(5, l22);

        AddTwoNumbersInLinkedList.ListNode eoutput3 = new AddTwoNumbersInLinkedList.ListNode(8);
        AddTwoNumbersInLinkedList.ListNode eoutput2 = new AddTwoNumbersInLinkedList.ListNode(0, eoutput3);
        AddTwoNumbersInLinkedList.ListNode eoutput = new AddTwoNumbersInLinkedList.ListNode(7, eoutput2);

        AddTwoNumbersInLinkedList.ListNode output = addTwoNumbersInLinkedList.addTwoNumbers(l1,l2);
        assertTrue(equals(output, eoutput));
    }

//    @Test
//    public void test1(){
//        AddTwoNumbersInLinkedList.ListNode l1 = new AddTwoNumbersInLinkedList.ListNode(5);
//
//        AddTwoNumbersInLinkedList.ListNode l2 = new AddTwoNumbersInLinkedList.ListNode(5);
//
//        AddTwoNumbersInLinkedList.ListNode eoutput2 = new AddTwoNumbersInLinkedList.ListNode(0);
//        AddTwoNumbersInLinkedList.ListNode eoutput = new AddTwoNumbersInLinkedList.ListNode(1, eoutput2);
//
//        AddTwoNumbersInLinkedList.ListNode output = addTwoNumbersInLinkedList.addTwoNumbers(l1,l2);
//        assertTrue(equals(output, eoutput));
//    }


    private boolean equals(AddTwoNumbersInLinkedList.ListNode l1, AddTwoNumbersInLinkedList.ListNode l2) {
        AddTwoNumbersInLinkedList.ListNode p1 = l1, p2 = l2;
        boolean b = true;
        while (p1 != null || p2 != null) {
            if (p1.val != p2.val) {
                b = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }


        return b;
    }

}