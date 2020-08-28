package com.algorithmpractice.algo.medium;

import java.util.ArrayList;
import java.util.List;

/*
When given two nodes on a tree, return the youngest common ancestor. Note the descendant is considered its own ancestor.
 */
public class YoungestCommonAncestor {

    public static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }

    //time O(d) | space O(1)
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {

        int descendantOneDepth = getDepth(descendantOne);
        int descendantTwoDepth = getDepth(descendantTwo);

        if(descendantOneDepth > descendantTwoDepth){
            return backtrackTree(descendantOne, descendantTwo, descendantOneDepth-descendantTwoDepth);
        }else{
            return backtrackTree(descendantTwo, descendantOne, descendantTwoDepth-descendantOneDepth);
        }
    }

    private static int getDepth(AncestralTree descendant){
        int depth = 0;
        while(descendant.ancestor != null){
            depth++;
            descendant = descendant.ancestor;
        }
        return depth;
    }

    private static AncestralTree backtrackTree(AncestralTree descendantLow, AncestralTree descendantHigh, int diff){
        while(diff > 0){
            descendantLow = descendantLow.ancestor;
            diff--;
        }
        while(descendantLow != descendantHigh){
            descendantLow = descendantLow.ancestor;
            descendantHigh = descendantHigh.ancestor;
        }
        return descendantLow;
    }

    //time O(d) | space O(d)
    public static AncestralTree getYoungestCommonAncestor1(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {

        List<AncestralTree> decendentOnesParents = new ArrayList<>();
        List<AncestralTree> decendentTwosParents = new ArrayList<>();

        populateListOfParents(decendentOnesParents, descendantOne);
        populateListOfParents(decendentTwosParents, descendantTwo);

        for(AncestralTree decendent : decendentOnesParents){
            if(decendentTwosParents.contains(decendent)){
                return decendent;
            }
        }

        return null;
    }

    private static void populateListOfParents(List<AncestralTree> tree, AncestralTree decendent){
        tree.add(decendent);
        while(decendent.ancestor != null){
            tree.add(decendent.ancestor);
            decendent = decendent.ancestor;
        }
    }

}
