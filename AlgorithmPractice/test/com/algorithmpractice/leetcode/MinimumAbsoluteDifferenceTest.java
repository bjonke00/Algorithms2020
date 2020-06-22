package com.algorithmpractice.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class MinimumAbsoluteDifferenceTest {

    private MinimumAbsoluteDifference minimumAbsoluteDifference;

    @Before
    public void setup() {
        minimumAbsoluteDifference = new MinimumAbsoluteDifference();
    }

    @Test
    public void test1() {
        int arr[] = new int[]{4, 2, 1, 3};
        List<List<Integer>> output = new ArrayList();
        output.add(Arrays.asList(new Integer[]{1, 2}));
        output.add(Arrays.asList(new Integer[]{2, 3}));
        output.add(Arrays.asList(new Integer[]{3, 4}));
        assertThat(minimumAbsoluteDifference.minimumAbsDifference(arr), is(equalTo(output)));
    }

    @Test
    public void test2() {
        int arr[] = new int[]{1, 3, 6, 10, 15};
        List<List<Integer>> output = new ArrayList();
        output.add(Arrays.asList(new Integer[]{1, 3}));
        assertThat(minimumAbsoluteDifference.minimumAbsDifference(arr), is(equalTo(output)));
    }

    @Test
    public void test3() {
        int arr[] = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> output = new ArrayList();
        output.add(Arrays.asList(new Integer[]{-14, -10}));
        output.add(Arrays.asList(new Integer[]{19, 23}));
        output.add(Arrays.asList(new Integer[]{23, 27}));
        assertThat(minimumAbsoluteDifference.minimumAbsDifference(arr), is(equalTo(output)));
    }

}
