package com.algorithmpractice.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoCityScheduleCostTest {

	private TwoCityScheduleCost t = new TwoCityScheduleCost();
	
	@Test
	public void test1() {
		int[][]costs = new int[][]{{10,20},{30,200},{400,50},{30,20}};
		assertEquals(110, t.twoCitySchedCost(costs));
	}
	
	@Test
	public void test2() {
		int[][]costs = new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
		assertEquals(1859, t.twoCitySchedCost(costs));
	}

}
