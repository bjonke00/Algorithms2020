package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinMaxStackConstruction {
    static class MinMaxStack {
        List<Integer> stack = new ArrayList<>();
        List<Map<String, Integer>> minMaxStack = new ArrayList<>();

        //time O(1) | space O(1)
        public int peek() {
            return stack.get(stack.size() - 1);
        }

        //time O(1) | space O(1)
        public int pop() {
            minMaxStack.remove(minMaxStack.size() - 1);
            return stack.remove(stack.size() - 1);
        }

        //time O(1) | space O(1)
        public void push(Integer number) {
            Map<String, Integer> minMaxMap = new HashMap<>();
            if (minMaxStack.isEmpty()) {
                minMaxMap.put("min", number);
                minMaxMap.put("max", number);
            } else {
                minMaxMap.put("min", Math.min(minMaxStack.get(minMaxStack.size() - 1).get("min"), number));
                minMaxMap.put("max", Math.max(minMaxStack.get(minMaxStack.size() - 1).get("max"), number));
            }
            minMaxStack.add(minMaxMap);
            stack.add(number);
        }

        //time O(1) | space O(1)
        public int getMin() {
            return minMaxStack.get(minMaxStack.size() - 1).get("min");
        }

        //time O(1) | space O(1)
        public int getMax() {
            return minMaxStack.get(minMaxStack.size() - 1).get("max");
        }
    }
}
