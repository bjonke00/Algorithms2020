package com.algorithmpractice.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PancakeSortTest {

    @Test
    public void test(){
        int[] expected = new int[]{-1000, 1, 5, 8, 17, 23, 34, 55, 100, 70000};
        assertTrue(equals(expected, PancakeSort.pancakeSort(new int[]{1, 5, 100, 8, 17, 23, 34, 55, -1000, 70000})));
    }

    @Test
    public void test1(){
        int[] expected = new int[]{};
        assertTrue(equals(expected, PancakeSort.pancakeSort(new int[]{})));
    }

    @Test
    public void test2(){
        Exception exception = assertThrows(RuntimeException.class, () -> {
           PancakeSort.pancakeSort(null);
        });

        String expectedMessage = "You can't sort a null pancake!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    public boolean equals(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            return false;
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }
}