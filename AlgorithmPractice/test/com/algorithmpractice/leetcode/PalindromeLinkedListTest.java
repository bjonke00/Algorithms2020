package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    private PalindromeLinkedList palindromeLinkedList;

    @Before
    public void setup(){
        palindromeLinkedList = new PalindromeLinkedList();
    }

    @Test
    public void test1(){
        PalindromeLinkedList.ListNode listNode4 = palindromeLinkedList.createListNode(1);
        PalindromeLinkedList.ListNode listNode3 = palindromeLinkedList.createListNode(2, listNode4);
        PalindromeLinkedList.ListNode listNode2 = palindromeLinkedList.createListNode(2, listNode3);
        PalindromeLinkedList.ListNode listNode1 = palindromeLinkedList.createListNode(1, listNode2);
        assertTrue(palindromeLinkedList.isPalindrome(listNode1));
    }

    @Test
    public void test2(){
        PalindromeLinkedList.ListNode listNode2 = palindromeLinkedList.createListNode(2);
        PalindromeLinkedList.ListNode listNode1 = palindromeLinkedList.createListNode(1, listNode2);
        assertFalse(palindromeLinkedList.isPalindrome(listNode1));
    }

    @Test
    public void test3(){
        PalindromeLinkedList.ListNode listNode2 = palindromeLinkedList.createListNode(0);
        PalindromeLinkedList.ListNode listNode1 = palindromeLinkedList.createListNode(0, listNode2);
        assertTrue(palindromeLinkedList.isPalindrome(listNode1));
    }
}