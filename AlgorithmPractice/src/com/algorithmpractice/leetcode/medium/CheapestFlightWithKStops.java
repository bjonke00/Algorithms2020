package com.algorithmpractice.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CheapestFlightWithKStops {
    class Solution {

        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {

            // We use two arrays for storing distances and keep swapping
            // between them to save on the memory
            long[][] distances = new long[2][n];
            Arrays.fill(distances[0], Integer.MAX_VALUE);
            Arrays.fill(distances[1], Integer.MAX_VALUE);
            distances[0][src] = distances[1][src] = 0;

            // K + 1 iterations of Bellman Ford
            for (int iterations = 0; iterations < K + 1; iterations++) {

                // Iterate over all the edges
                for (int[] edge : flights) {

                    int start = edge[0], destination = edge[1], price = edge[2];

                    // Current distance of node "s" from src
                    long dU = distances[1 - iterations&1][start];

                    // Current distance of node "d" from src
                    // Note that this will port existing values as
                    // well from the "previous" array if they didn't already exist
                    long dV = distances[iterations&1][destination];

                    // Relax the edge if possible
                    if (dU + price < dV) {
                        distances[iterations&1][destination] = dU + price;
                    }
                }
            }

            return distances[K&1][dst] < Integer.MAX_VALUE ? (int)distances[K&1][dst] : -1;
        }
    }
}
