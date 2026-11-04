package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCount {

	public static void main(String[] args) {
		int[]arr= {1,2,2,3,1,4,3};
		Map<Integer,Integer>map=new LinkedHashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
System.out.println("Frequencies:"+map);
	}

}
