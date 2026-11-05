package com.collections;

import java.util.HashMap;
import java.util.PriorityQueue;

public class KmostFrequent {

	public static void main(String[] args) {
		int[]arr= {1,1,1,2,2,3};
		int k=2;
		//Count Frequency
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr) {
			map.put(num,map.getOrDefault(num,0)+1);
		}
		//Priority Queue
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		pq.addAll(map.keySet());
		
		for(int i=0;i<k;i++) {
		System.out.println(pq.poll());
		}
	}

}
