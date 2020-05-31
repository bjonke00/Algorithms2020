package com.algorithmpractice.codekata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BinaryChop3 {
	
	
	public List<Integer> binaryChop(List<Integer> i, List<List<Integer>> list) throws InterruptedException, ExecutionException {
		List<Integer> results = new ArrayList<>();
		List<Future> futures = new ArrayList<>();
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int a=0; a<i.size(); a++) {
			futures.add(binaryChopMulti(executor, i.get(a), list.get(a)));
		}
		
		futures.forEach(f -> {
			try {
				results.add(getResult(f));
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		});
		
		return results;
	}

	public Future<Integer> binaryChopMulti(ExecutorService executor, Integer i, List<Integer> list) throws InterruptedException, ExecutionException {
		return executor.submit(()->{
			System.out.println("Executing binary search scenario : " + i.toString() + ", " + list.toString() + " on thread " + Thread.currentThread().getName());
			BinaryChop2 bc2 = new BinaryChop2();
			int[] array = list.stream()
					.mapToInt(l -> (l == null ? 0 : l))
					.toArray();
			return bc2.binaryChop(i, array); 
		});
	}
	
	public Integer getResult(Future future) throws InterruptedException, ExecutionException {
		System.out.println("Checking if the thread " + Thread.currentThread().getName() + " is done executing.");
		while (!future.isDone()) {
			System.out.println("Not yet waiting...");
			Thread.sleep(100);
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " is done executing.");
		return (Integer) future.get();
	}
	
}
