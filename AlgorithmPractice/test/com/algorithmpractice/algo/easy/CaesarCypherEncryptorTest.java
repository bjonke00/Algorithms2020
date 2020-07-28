package com.algorithmpractice.algo.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCypherEncryptorTest {
    @Test
    public void TestCase1() {
        CaesarCypherEncryptor c = new CaesarCypherEncryptor();
        assertTrue(c.caesarCypherEncryptor("xyz", 2).equals("zab"));
    }
}