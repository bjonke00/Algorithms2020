package com.algorithmpractice.algo.hard;

import java.util.ArrayList;
import java.util.List;

public class UnderscorifySubstring {
    //find the indices of the substring and keep track of them
    //if there are two or more substrings in a row merge the indices to keep track of only the surrounding indices
    //insert the underscores before and after the substring(s) - will need to add to list
    //time O(n+m) space O(n)
    public static String underscorifySubstring(String str, String substring) {
        List<Integer[]> locations = mergeLocations(getLocations(str, substring));
        return underscorifySubstring(str, locations);
    }

    static List<Integer[]> getLocations(String str, String substring){
        List<Integer[]> locations = new ArrayList<>();
        int startIdx = 0, nextIdx;
        while(startIdx < str.length()){
            Integer[] indices = new Integer[2];
            nextIdx = str.indexOf(substring, startIdx);
            if(nextIdx == -1)
                break;
            indices[0] = nextIdx;
            indices[1] = nextIdx + substring.length();
            locations.add(indices);
            startIdx = nextIdx + 1;
        }
        return locations;
    }

    static List<Integer[]> mergeLocations(List<Integer[]> locations){
        if(locations.size() == 0)
            return locations;
        List<Integer[]> newLocations = new ArrayList<>();
        newLocations.add(locations.get(0));
        Integer[] previous = newLocations.get(0);
        for(int i=1; i<locations.size(); i++){
            Integer[] current = locations.get(i);
            if(previous[1] >= current[0]){
                previous[1] = current[1];
            }else{
                newLocations.add(current);
                previous = current;
            }
        }
        return newLocations;
    }

    private static String underscorifySubstring(String str, List<Integer[]> locations){
        List<String> underScored = new ArrayList<>();

        int i = 0, stringIdx = 0, locationIdx =0;
        while(stringIdx < str.length() && locationIdx < locations.size()){
            if(stringIdx == locations.get(locationIdx)[i]){
                underScored.add("_");
                if(i==1)
                    locationIdx++;
                i = i == 0 ? 1 : 0;
            }
            underScored.add(String.valueOf(str.charAt(stringIdx)));
            stringIdx++;
        }
        if(locationIdx < locations.size()){
            underScored.add("_");
        }else if(stringIdx < str.length()){
            underScored.add(str.substring(stringIdx));
        }

        return String.join("", underScored);
    }

}
