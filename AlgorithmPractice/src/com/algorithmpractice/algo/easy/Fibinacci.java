package com.algorithmpractice.algo.easy;

import java.util.HashMap;

public class Fibinacci {

    //time O(n) space O(1)
    public static int getNthFib(int n) {
        int[] lastTwo = {0,1};
        int count = 3;
        while(count<=n){
            int fib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = fib;
            count++;
        }
        return n<=1 ? lastTwo[0] : lastTwo[1];
    }

    //time O(n) space O(1)
    public int getNthFib_memo(int n){
        HashMap<Integer,Integer> memoizer = new HashMap<>();
        memoizer.put(1,0);
        memoizer.put(2,1);
        return fib(n, memoizer);
    }

    private Integer fib(Integer n, HashMap<Integer,Integer> memoizer) {
        if(memoizer.containsKey(n)){
            return memoizer.get(n);
        }else{
            memoizer.put(n,fib(n-1,memoizer)+fib(n-2,memoizer));
            return memoizer.get(n);
        }
    }

    //time O(2^n) space O(n)
    public int getNthFib_recursive(int n) {
        if(n==2){
            return 1;
        }else if(n==1){
            return 0;
        }else{
            return getNthFib(n-1) + getNthFib(n-2);
        }
    }
}
