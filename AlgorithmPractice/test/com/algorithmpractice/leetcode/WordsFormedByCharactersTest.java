package com.algorithmpractice.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordsFormedByCharactersTest {
	
	private WordsFormedByCharacters wfbc = new WordsFormedByCharacters();
	
	@Test
	public void test1() {
		List<String> words1 = Arrays.asList(new String[] {"cat", "bt", "hat", "tree"});
		String chars1 = "atach";
		assertEquals(6, wfbc.countCharacters(words1, chars1));
	}
	
	@Test
	public void test2() {
		List<String> words2 = Arrays.asList(new String[] {"hello","world","leetcode"});
		String chars2 = "welldonehoneyr";
		assertEquals(10, wfbc.countCharacters(words2, chars2));
	}
	
	@Test
	public void test3() {
		List<String> words3 = Arrays.asList(new String[] {"hello","world","leetcode"});
		String chars3 = "weldonehoneyr";
		assertEquals(5, wfbc.countCharacters(words3, chars3));
	}

}
