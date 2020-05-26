package com.algorithmpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

	// time : O(n^2) , space: O(1)
	public static int[] twoNumberSum(int[] array, int targetSum) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == targetSum) {
					return new int[] { array[i], array[j] };
				}
			}
		}
		return new int[0];
	}

	// time : O(n) , space : O(n)
	public static int[] twoNumberSum1(int[] array, int targetSum) {

		Map<Integer, Boolean> visited = new HashMap<>();

		for (int number : array) {
			int secondNumber = targetSum - number;
			if (visited.containsKey(secondNumber)) {
				return new int[] { secondNumber, number };
			} else {
				visited.put(number, true);
			}
		}

		return new int[0];
	}

	// time : O(nlog(n)) , space : O(1)
	public static int[] twoNumberSum2(int[] array, int targetSum) {
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == targetSum) {
				return new int[] { array[left], array[right] };
			} else if (sum < targetSum) {
				left++;
			} else if (sum > targetSum) {
				right--;
			}
		}

		return new int[0];
	}

	public static void main(String[] args) {
		for (int i : twoNumberSum2(new int[] { new Integer(3), 14, 8, 9, 22, 88, 99, 100, 7 }, 10)) {
			System.out.print(i + " ");
		}
		System.out.println();

		Integer[] ar = new Integer[] { 1, 2, 3 };
		List<Integer> list = Arrays.asList(ar);
		list.forEach(i -> System.out.println(i));

		int[] ints = new int[] { 4, 5, 6 };
		List<Integer> list8 = Arrays.stream(ints).boxed().collect(Collectors.toList());
		list8.forEach(i -> System.out.println(i));
	}
}
