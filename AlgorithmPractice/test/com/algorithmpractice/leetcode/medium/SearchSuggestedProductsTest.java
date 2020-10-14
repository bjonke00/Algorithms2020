package com.algorithmpractice.leetcode.medium;

import com.algorithmpractice.leetcode.medium.SearchSuggestedProducts;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class SearchSuggestedProductsTest {

    public static class Collections {
        public static <T> List<T> asList(T... items) {
            List<T> list = new ArrayList<T>();
            for (T item : items) {
                list.add(item);
            }
            return list;
        }
    }

    //starting with 2 characters
    @Test
    public void test1() {
        List<String> repo = new ArrayList<>(asList("mobile", "mouse", "moneypot", "monitor", "mousepad"));
        String product = "mouse";

        List<List<String>> expected = asList(
                asList("mobile", "moneypot", "monitor"),
                asList("mouse", "mousepad"),
                asList("mouse", "mousepad"),
                asList("mouse", "mousepad")
        );

        List<List<String>> actual2 = SearchSuggestedProducts.suggestedProducts(repo, product);
        assertEquals(expected, actual2);
    }

    @Test
    public void test2() {
        List<String> repo = new ArrayList<>(asList("bags","baggage","banner","box","cloths"));
        String product = "bags";

        List<List<String>> expected = asList(
                asList("baggage","bags","banner"),
                asList("baggage","bags"),
                asList("bags")
        );

        List<List<String>> actual2 = SearchSuggestedProducts.suggestedProducts(repo, product);
        assertEquals(expected, actual2);
    }

    @Test
    public void test3() {
        List<String> repo = new ArrayList<>(asList("havana"));
        String product = "havana";

        List<List<String>> expected = asList(
                asList("havana"),
                asList("havana"),
                asList("havana"),
                asList("havana"),
                asList("havana")
        );
        List<List<String>> actual2 = SearchSuggestedProducts.suggestedProducts(repo, product);
        assertEquals(expected, actual2);
    }

    @Test
    public void test4() {
        List<String> repo = new ArrayList<>(asList("havana"));
        String product = "tatiana";

        List<List<String>> expected = asList(
                asList(),
                asList(),
                asList(),
                asList(),
                asList(),
                asList()
        );
        List<List<String>> actual2 = SearchSuggestedProducts.suggestedProducts(repo, product);
        assertEquals(expected, actual2);
    }

    //case insensitive
//    @Test TODO : revise case insensitive scenario
    public void test5() {
        List<String> repo = new ArrayList<>(asList("abcdefg", "abc", "aBc", "Z", "a"));
        String product = "abcdefG";

        List<List<String>> expected = asList(
                asList("abc","aBc", "abcdefg"),
                asList("abc","aBc", "abcdefg"),
                asList("abcdefg"),
                asList("abcdefg"),
                asList("abcdefg"),
                asList("abcdefg")
        );
        List<List<String>> actual2 = SearchSuggestedProducts.suggestedProductsCaseInsensitive(repo, product);
        assertEquals(expected, actual2);
    }

}