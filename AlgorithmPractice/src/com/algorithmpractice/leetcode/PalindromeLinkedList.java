package com.algorithmpractice.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PalindromeLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode createListNode(int val){
        return new ListNode(val);
    }

    public ListNode createListNode(int val, ListNode next){
        return new ListNode(val, next);
    }
    
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque();
        ListNode current = head;
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }
        current = head;
        while(current != null){
            if(stack.pop()!=current.val){
                return false;
            }
            current = current.next;
        }
        return true;
    }

}
