package com.algorithmpractice.other;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class UniqueOccurrencesTest {

	private UniqueOccurrences uniqueOccurrences = new UniqueOccurrences();
	
	@Test
	public void test1() {
		assertTrue(uniqueOccurrences.uniqueOccurrences(Arrays.asList(new Integer[]{1,2,2,1,1,3})));
	}
	
	@Test
	public void test2() {
		assertFalse(uniqueOccurrences.uniqueOccurrences(Arrays.asList(new Integer[]{1,2})));
	}
	
	@Test
	public void test3() {
		assertTrue(uniqueOccurrences.uniqueOccurrences(Arrays.asList(new Integer[]{-3,0,1,-3,1,1,1,-3,10,0})));
	}

}
