package com.algorithmpractice.leetcode;

import java.util.*;

public class BalancedBrackets {
    //time O(n) space O(n)
    public boolean isValid(String s) {
        //create map of valid bracket pairs
        //<open bracket, closing bracket>
        Map<Character,Character> brackets = new HashMap();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');

        //create stack/deque
        Deque<Character> deque = new ArrayDeque();

        //add characters from string to deque
        for(int i=0; i<s.length(); i++){
            Character bracket = s.charAt(i);
            //if opening bracket add it to deque
            if(brackets.containsKey(bracket)){
                deque.push(bracket);
            }else if (bracket == brackets.get(deque.peek())){
                deque.pop();
            }else{
                return false;
            }
        }

        return deque.peek()==null;
    }

    //stack datastructure
    public boolean isValid1(String s) {
        //create map of valid bracket pairs
        //<open bracket, closing bracket>
        Map<Character,Character> brackets = new HashMap();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');

        //create stack
        Stack<Character> stack = new Stack();

        //add characters from string to stack
        for(int i=0; i<s.length(); i++){
            Character bracket = s.charAt(i);
            //if opening bracket add it to stack
            if(brackets.containsKey(bracket)){
                stack.push(bracket);
            }else if (!stack.empty() && bracket == brackets.get(stack.peek())){ //stack throws emptystackexception
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.empty();
    }
}
