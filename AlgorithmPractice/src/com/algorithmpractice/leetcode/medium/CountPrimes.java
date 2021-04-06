package com.algorithmpractice.leetcode.medium;

public class CountPrimes {
    //O(nlog(log(n))) time and O(n) space
    //eratostehenes primes
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i < n; i++){
            if(!isPrime[i]){
                continue;
            }
            for(int j = i * i; j < n; j += i){
                isPrime[j] = false;
            }
        }

        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime[i]) count++;
        }

        return count;
    }

    //O(n^2) time and O(1) space
    public int countPrimesNaive(int n) {
        int count = 0;
        for(int i = 0; i < n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }else if(n < 4){
            return true;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
