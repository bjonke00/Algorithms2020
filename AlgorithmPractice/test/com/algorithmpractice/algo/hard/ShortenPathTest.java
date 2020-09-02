package com.algorithmpractice.algo.hard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortenPathTest {

    private ShortenPath shortenPath;

    @Before
    public void setup() {
        shortenPath = new ShortenPath();
    }

    @Test
    public void TestCase1() {
        String expected = "/foo/bar/baz";
        String actual = shortenPath.shortenPath("/foo/bar/baz");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        String expected = "foo/bar/baz";
        String actual = shortenPath.shortenPath("foo/bar/baz");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        String expected = "/foo/bar/baz";
        String actual = shortenPath.shortenPath("/../../foo/bar/baz");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        String expected = "../../foo/bar/baz";
        String actual = shortenPath.shortenPath("../../foo/bar/baz");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        String expected = "..";
        String actual = shortenPath.shortenPath("foo/../..");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        String expected = "/";
        String actual = shortenPath.shortenPath("/../../../this////one/./../../is/../../going/../../to/be/./././../../../just/a/forward/slash/../../../../../../");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase7() {
        String expected = "..";
        String actual = shortenPath.shortenPath("./..");
        assertEquals(expected, actual);
    }
}