package com.algorithmpractice.algo.graph.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopologicalSort {
    //time and space O(j+d) -> jobs and dependencies aka edge + vertice since it uses depthFirstSearch
    //dependency of a job is same as prerequisite of a job
    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        JobGraph jobGraph = createJobGraph(jobs, deps);
        return getOrderedJobs(jobGraph);
    }

    public static JobGraph createJobGraph(List<Integer> jobs, List<Integer[]> deps){
        JobGraph jobGraph = new JobGraph(jobs);

        for(Integer[] dep : deps){
            jobGraph.addDependency(dep[1], dep[0]);
        }

        return jobGraph;
    }

    public static List<Integer> getOrderedJobs(JobGraph jobGraph){
        List<Integer> orderedJobs = new ArrayList<>();
        List<JobNode> nodes = new ArrayList<>(jobGraph.nodes);

        while(!nodes.isEmpty()){
            JobNode node = nodes.remove(0);
            if(isCyclicDependencyDFS(node, orderedJobs))
                return new ArrayList<>(0);
        }

        return orderedJobs;
    }

    public static boolean isCyclicDependencyDFS(JobNode node, List<Integer> orderedJobs){
        if(node.processed) return false;
        if(node.processing) return true;
        node.processing = true;
        for(JobNode dep : node.dependencies){
            if(isCyclicDependencyDFS(dep, orderedJobs)){
                return true;
            }
        }
        node.processed = true;
        node.processing = false;
        orderedJobs.add(node.job);
        return false;
    }

    static class JobGraph{
        Map<Integer, JobNode> dependencyMap = new HashMap<>();
        List<JobNode> nodes = new ArrayList<>();

        public JobGraph(List<Integer> jobs){
            for(Integer job : jobs){
                dependencyMap.put(job, new JobNode(job));
                nodes.add(dependencyMap.get(job));
            }
        }

        public void addDependency(Integer job, Integer dep){
            JobNode jobNode = dependencyMap.get(job);
            JobNode depNode = dependencyMap.get(dep);
            jobNode.dependencies.add(depNode);
        }
    }

    static class JobNode{
        int job;
        List<JobNode> dependencies = new ArrayList<>();
        boolean processed = false;
        boolean processing = false;

        public JobNode(int job){
            this.job = job;
        }
    }
}
