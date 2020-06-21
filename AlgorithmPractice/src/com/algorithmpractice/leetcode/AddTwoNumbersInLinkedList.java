package com.algorithmpractice.leetcode;

public class AddTwoNumbersInLinkedList {

//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }
    //    Input: (2 -> 4 -> 3) +
    //           (5 -> 6 -> 4)
    //    Output: 7 -> 0 -> 8
    //    Explanation: 342 + 465 = 807.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode p1 = l1, p2 = l2, current = head;
        while (p1 != null || p2 != null) {
            int val1 = (p1 != null) ? p1.val : 0;
            int val2 = (p2 != null) ? p2.val : 0;
            int sum = val1 + val2 + carry;
            current.next = new ListNode(sum % 10);  // 7%10=7  11%10=1
            carry = sum / 10; // int 21/10 = 2
            current = current.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return head.next;
    }
}
