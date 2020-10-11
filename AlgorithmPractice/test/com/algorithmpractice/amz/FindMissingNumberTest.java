package com.algorithmpractice.amz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMissingNumberTest {

    private FindMissingNumber findMissingNumber;

    @Before
    public void setup(){
        findMissingNumber = new FindMissingNumber();
    }

    @Test
    public void test_8_missing_6(){
        int actual = findMissingNumber.findMissingNumber(new int[] {5,1,8,2,4,7,3});
        int expected = 6;
        assertEquals(expected, actual);
    }
}