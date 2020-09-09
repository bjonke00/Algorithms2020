package com.algorithmpractice.algo.veryhard;

import java.util.HashSet;
import java.util.Set;

public class RectangleCount {
    //O(n^2) time and O(n) space
    public static int getRectangleCount(Point[] coords) {
        Set<String> coordsSet = getCoordsSet(coords);
        return getRectangleCount(coords, coordsSet);
    }

    public static Set<String> getCoordsSet(Point[] coords){
        Set<String> coordsSet = new HashSet<>();
        for(Point coord : coords){
            String coordString = coordToString(coord);
            coordsSet.add(coordString);
        }
        return coordsSet;
    }

    public static int getRectangleCount(Point[] coords, Set<String> coordsSet){
        int rectangleCount = 0;
        for(Point coord1 : coords){
            for(Point coord2 : coords){
                if(!isInUpperRight(coord1, coord2)) continue;
                String upperCoordString = coordToString(new Point(coord1.x, coord2.y));
                String rightCoordString = coordToString(new Point(coord2.x, coord1.y));
                if(coordsSet.contains(upperCoordString) && coordsSet.contains(rightCoordString))
                    rectangleCount++;
            }
        }
        return rectangleCount;
    }

    public static boolean isInUpperRight(Point coord1, Point coord2){
        return coord2.x > coord1.x && coord2.y > coord1.y;
    }

    public static String coordToString(Point coord){
        return Integer.toString(coord.x) + "-" + Integer.toString(coord.y);
    }

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
