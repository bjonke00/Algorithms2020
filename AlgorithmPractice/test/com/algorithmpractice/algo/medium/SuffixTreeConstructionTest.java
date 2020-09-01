package com.algorithmpractice.algo.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixTreeConstructionTest {

    @Test
    public void TestCase1_contains_abc() {
        SuffixTrieConstruction.SuffixTrie suffixTrie = new SuffixTrieConstruction.SuffixTrie("babc");
        assertTrue(suffixTrie.contains("abc"));
    }

    @Test
    public void TestCase2_contains_c() {
        SuffixTrieConstruction.SuffixTrie suffixTrie = new SuffixTrieConstruction.SuffixTrie("babc");
        assertTrue(suffixTrie.contains("c"));
    }

    @Test
    public void TestCase3_ca_not_in_trie() {
        SuffixTrieConstruction.SuffixTrie suffixTrie = new SuffixTrieConstruction.SuffixTrie("babc");
        assertFalse(suffixTrie.contains("ca"));
    }

    @Test
    public void TestCase4_should_end_with_c() {
        SuffixTrieConstruction.SuffixTrie suffixTrie = new SuffixTrieConstruction.SuffixTrie("babc");
        assertFalse(suffixTrie.contains("bab"));
    }

}