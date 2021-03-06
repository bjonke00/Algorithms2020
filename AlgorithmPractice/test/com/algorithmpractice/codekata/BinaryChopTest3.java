package com.algorithmpractice.codekata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

import com.algorithmpractice.codekata.BinaryChop3;

public class BinaryChopTest3 {

	private BinaryChop3 binaryChop = new BinaryChop3();
	
	
	@Test
	public void test_multithreaded() throws InterruptedException, ExecutionException {
		
		
		int[] answersArray = new int[] {3,3,1,-1,8,9,-1,10,-1};
		Arrays.parallelSort(answersArray);
		List<Integer> expectedOutput = new ArrayList<>(answersArray.length);
		for(int a : answersArray) {
			expectedOutput.add(Integer.valueOf(a));
		}
		
		
		int[] iArray = new int[] {33,111,5,35,72,73,70,355,354};
		List<Integer> iList = new ArrayList<>(iArray.length);
		for(int i : iArray) {
			iList.add(Integer.valueOf(i));
		}
		
		List<Integer> list1 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73});
		List<Integer> list2 = Arrays.asList(new Integer[] {1, 5, 23, 111});
		List<Integer> list3 = Arrays.asList(new Integer[] {1, 5, 23, 111});
		List<Integer> list4 = Arrays.asList(new Integer[] {1, 5, 23, 111});
		List<Integer> list5 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73});
		List<Integer> list6 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73});
		List<Integer> list7 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73});
		List<Integer> list8 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355});
		List<Integer> list9 = Arrays.asList(new Integer[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73, 355});
		
		List<List<Integer>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		list.add(list5);
		list.add(list6);
		list.add(list7);
		list.add(list8);
		list.add(list9);
		

		List<Integer> output = binaryChop.binaryChop(iList, list);
		Collections.sort(output);

		assertEquals(expectedOutput, output);
	}

}
