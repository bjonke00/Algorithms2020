package com.algorithmpractice.algo.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuffixTreeConstructionTest {

    @Test
    public void TestCase1_contains_abc() {
        SuffixTreeConstruction.SuffixTrie suffixTrie = new SuffixTreeConstruction.SuffixTrie("babc");
        assertTrue(suffixTrie.contains("abc"));
    }

    @Test
    public void TestCase2_contains_c() {
        SuffixTreeConstruction.SuffixTrie suffixTrie = new SuffixTreeConstruction.SuffixTrie("babc");
        assertTrue(suffixTrie.contains("c"));
    }

    @Test
    public void TestCase3_ca_not_in_trie() {
        SuffixTreeConstruction.SuffixTrie suffixTrie = new SuffixTreeConstruction.SuffixTrie("babc");
        assertFalse(suffixTrie.contains("ca"));
    }

    @Test
    public void TestCase4_should_end_with_c() {
        SuffixTreeConstruction.SuffixTrie suffixTrie = new SuffixTreeConstruction.SuffixTrie("babc");
        assertFalse(suffixTrie.contains("bab"));
    }

}