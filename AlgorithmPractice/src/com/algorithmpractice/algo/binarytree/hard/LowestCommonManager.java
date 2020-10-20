package com.algorithmpractice.algo.binarytree.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LowestCommonManager {
    public static OrgChart getLowestCommonManager(
            OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {
        return getOrgInfo(topManager, reportOne, reportTwo).lowestCommonManager;
    }

    public static OrgInfo getOrgInfo(OrgChart manager,OrgChart reportOne,OrgChart reportTwo){
        int numOfReports = 0;
        for(OrgChart directReport : manager.directReports){
            OrgInfo orgInfo = getOrgInfo(directReport, reportOne, reportTwo);
            if(orgInfo.lowestCommonManager != null) return orgInfo;
            numOfReports += orgInfo.numOfReports;
        }
        if(manager.name == reportOne.name || manager.name == reportTwo.name) numOfReports++;
        OrgChart lowestCommonManager = numOfReports == 2 ? manager : null;
        OrgInfo newOrgInfo = new OrgInfo(lowestCommonManager, numOfReports);
        return newOrgInfo;
    }

    static class OrgInfo{
        OrgChart lowestCommonManager;
        int numOfReports;

        public OrgInfo(OrgChart lowestCommonManager, int numOfReports){
            this.lowestCommonManager = lowestCommonManager;
            this.numOfReports = numOfReports;
        }
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<OrgChart>();
        }

        // This method is for testing only.
        public void addDirectReports(OrgChart[] directReports) {
            for (OrgChart directReport : directReports) {
                this.directReports.add(directReport);
            }
        }
    }
}
//    public static OrgChart getLowestCommonManager(
//            OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {
//        List<OrgChart> subtrees = findCommonSubtrees(topManager, reportOne, reportTwo);
//        return subtrees.get(subtrees.size() - 1);
//    }
//
//    public static List<OrgChart> findCommonSubtrees(OrgChart topManager,OrgChart reportOne,OrgChart reportTwo){
//        List<OrgChart> subtrees = new ArrayList<>();
//        Queue<OrgChart> queue = new LinkedList<>();
//        queue.add(topManager);
//        while(!queue.isEmpty()){
//            OrgChart manager = queue.poll();
//            if(isValidSubtree(manager, reportOne, reportTwo, false, false)){
//                subtrees.add(manager);
//            }
//            for(OrgChart directReport : manager.directReports){
//                queue.add(directReport);
//            }
//        }
//
//        return subtrees;
//    }
//
//    public static boolean isValidSubtree(OrgChart manager, OrgChart reportOne, OrgChart reportTwo, boolean hasReportOne, boolean hasReportTwo){
//        if(hasReportOne && hasReportTwo){
//            return true;
//        }
//
//        for(OrgChart directReport : manager.directReports){
//            if(directReport.name == reportOne.name){
//                return isValidSubtree(directReport, reportOne, reportTwo, true, hasReportTwo);
//            }else if(directReport.name == reportTwo.name){
//                return isValidSubtree(directReport, reportOne, reportTwo, hasReportOne, true);
//            }else{
//                return isValidSubtree(directReport, reportOne, reportTwo, hasReportOne, hasReportTwo);
//            }
//        }
//
//        return false;
//    }
//
//    static class OrgChart {
//        public char name;
//        public List<OrgChart> directReports;
//
//        OrgChart(char name) {
//            this.name = name;
//            this.directReports = new ArrayList<OrgChart>();
//        }
//
//        // This method is for testing only.
//        public void addDirectReports(OrgChart[] directReports) {
//            for (OrgChart directReport : directReports) {
//                this.directReports.add(directReport);
//            }
//        }
//    }
//}
