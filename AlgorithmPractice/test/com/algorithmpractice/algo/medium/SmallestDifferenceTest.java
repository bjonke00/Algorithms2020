package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SmallestDifferenceTest {

    private SmallestDifference smallestDifference;

    @Before
    public void setup() {
        smallestDifference = new SmallestDifference();
    }

    @Test
    public void TestCase1() {
        int[] expected = {28, 26};
        assertThat(smallestDifference.smallestDifference(new int[]{-1, 5, 10, 20, 28, 3}, new int[]{26, 134, 135, 15, 17}),
                        is(equalTo(expected)));
    }

    @Test
    public void TestCase2() {
        int[] expected = {28, 28};
        assertThat(smallestDifference.smallestDifference(new int[]{-1, 1000, 28}, new int[]{28, 134, 135, 15}),
                        is(equalTo(expected)));
    }

    @Test
    public void TestCase3() {
        int[] expected = {-1, -20};
        assertThat(smallestDifference.smallestDifference(new int[]{-1}, new int[]{29, 134, 135, -20}),
                is(equalTo(expected)));
    }
}