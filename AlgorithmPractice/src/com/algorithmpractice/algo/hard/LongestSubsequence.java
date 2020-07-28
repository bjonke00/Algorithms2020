package com.algorithmpractice.algo.hard;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequence {
	public static List<Character> longestCommonSubsequence(String str1, String str2) {

		int[][] subsequenceGraph = new int[str1.length() + 1][str2.length() + 1];

		// create subsequenceGraph
		for (int i = 1; i < str1.length() + 1; i++) {
			for (int j = 1; j < str2.length() + 1; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					subsequenceGraph[i][j] = subsequenceGraph[i - 1][j - 1] + 1;
				} else {
					subsequenceGraph[i][j] = Math.max(subsequenceGraph[i - 1][j], subsequenceGraph[i][j - 1]);
				}
			}
		}

		// find longest subsequence in subsequence graph
		List<Character> lcs = new ArrayList<>();
		int x = subsequenceGraph.length - 1;
		int y = subsequenceGraph[0].length - 1;
		while (x != 0 && y != 0) {
			if (subsequenceGraph[x][y] == subsequenceGraph[x - 1][y]) {
				x--;
			} else if (subsequenceGraph[x][y] == subsequenceGraph[x][y - 1]) {
				y--;
			} else {
				lcs.add(0, str2.charAt(y-1));
				x--;
				y--;
			}
		}

		return lcs;
	}

}
