package com.algorithmpractice.leetcode;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ReshapeMatrixTest {

    private final ReshapeMatrix reshapeMatrix = new ReshapeMatrix();

    @Test
    public void test() {
        int[][] expectedReshaped = new int[][]{{1, 2, 3, 4}};
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        assertThat(reshapeMatrix.matrixReshape(matrix, 1, 4), is(equalTo(expectedReshaped)));
    }

    @Test
    public void test1() {
        int[][] expectedReshaped = new int[][]{{1}, {2}, {3}, {4}};
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        assertThat(reshapeMatrix.matrixReshape(matrix, 4, 1), is(equalTo(expectedReshaped)));
    }

    @Test
    public void test2() {
        int[][] expectedReshaped = new int[][]{{1, 2}, {3, 4}};
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        assertThat(reshapeMatrix.matrixReshape(matrix, 1, 5), is(equalTo(expectedReshaped)));
    }

}
