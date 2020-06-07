package com.algorithmpractice.other;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighestScoringWordTest {

    private HighestScoringWord highestScoringWord;

    @Before
    public void setup(){
        highestScoringWord = new HighestScoringWord();
    }

    @Test
    public void test1(){
        assertEquals("f",highestScoringWord.findHighestScoringWord("a b c d e f"));
    }
    @Test
    public void test2(){
        assertEquals("world",highestScoringWord.findHighestScoringWord("hello world"));
    }
    @Test
    public void test3(){
        assertEquals("my",highestScoringWord.findHighestScoringWord("go ahead make my day"));
    }
    @Test
    public void test4(){
        assertEquals("there",highestScoringWord.findHighestScoringWord("there is no place like home"));
    }
    @Test
    public void test5(){
        assertEquals("aaaaaa",highestScoringWord.findHighestScoringWord("aaaaaa bbb cc f"));
    }
    @Test
    public void test6(){
        assertEquals("bbb",highestScoringWord.findHighestScoringWord("bbb cc f aaaaaa"));
    }
    @Test
    public void test7() {
        assertEquals("sentence", highestScoringWord.findHighestScoringWord("this sentence has two highest scoring words"));
    }

}