package com.algorithmpractice.algo.arrays.extreme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApartmentHunting {
    //time O(br) space O(br)
    public static int apartmentHunting(List<Map<String, Boolean>> blocks, String[] reqs) {

        List<Map<String, Integer>> blocksAway = new ArrayList<>();
        for(int i=0; i<blocks.size(); i++){
            Map<String, Integer> blockAway = new HashMap<>();
            for(String req : reqs){
                if(blocks.get(i).get(req)){
                    blockAway.put(req, 0);
                }else{
                    blockAway.put(req, -1);
                }
            }
            blocksAway.add(blockAway);
        }

        for(int i=1; i<blocks.size(); i++){
            for(String req : reqs){
                Map<String, Integer> previousBlock = blocksAway.get(i-1);
                Map<String, Integer> currentBlock = blocksAway.get(i);
                if(currentBlock.get(req) == -1){
                    if(previousBlock.get(req) != -1){
                        blocksAway.get(i).put(req, previousBlock.get(req)+1);
                    }
                }
            }
        }

        for(int i=blocks.size()-2; i>=0; i--){
            for(String req : reqs){
                Map<String, Integer> previousBlock = blocksAway.get(i+1);
                Map<String, Integer> currentBlock = blocksAway.get(i);
                if(currentBlock.get(req) == -1){
                    if(previousBlock.get(req) != -1){
                        blocksAway.get(i).put(req, previousBlock.get(req)+1);
                    }
                }
            }
        }

        List<Integer> maxBlocksAway = new ArrayList<>();
        for(int i=0; i<blocksAway.size(); i++){
            int max = Integer.MIN_VALUE;
            for(String req : reqs){
                max = Math.max(max, blocksAway.get(i).get(req));
            }
            maxBlocksAway.add(max);
        }

        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        for(int i = 0; i < maxBlocksAway.size(); i++){
            if(maxBlocksAway.get(i) < min){
                min = maxBlocksAway.get(i);
                minIdx = i;
            }
        }

        return minIdx;
    }
}
