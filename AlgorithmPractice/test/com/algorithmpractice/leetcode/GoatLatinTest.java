package com.algorithmpractice.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoatLatinTest {

	private GoatLatin goatLatin = new GoatLatin();
	
	@Test
	public void test1() {
		String input = "I speak Goat Latin";
		String output = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
		assertEquals(output, goatLatin.toGoatLatin(input));
	}
	
	@Test
	public void test2() {
		String input = "The quick brown fox jumped over the lazy dog";
		String output = "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa";
		assertEquals(output, goatLatin.toGoatLatin(input));
	}
	
}
