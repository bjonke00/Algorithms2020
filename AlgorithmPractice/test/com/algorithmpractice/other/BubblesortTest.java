package com.algorithmpractice.other;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class BubblesortTest {

    private Bubblesort bubblesort;

    @Before
    public void setup(){
        bubblesort = new Bubblesort();
    }

    @Test
    public void testBubblesort(){
        int[] input = new int[]{4, 7, 2, 3, 8};
        int[] output = new int[]{2, 3, 4, 7, 8};
        assertThat(bubblesort.bubblesort(input), is(equalTo(output)));
    }
}