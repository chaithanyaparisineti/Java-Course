package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class commonelements {
	public static void main(String[] args) {
		int[]arr1= {1,5,10};
		int[]arr2= {1,4,10};
		int[]arr3= {1,6,10};
		Set<Integer>set1=new TreeSet<>();
		Set<Integer>set2=new TreeSet<>();
		Set<Integer>set3=new TreeSet<>();
		for(int num:arr1) {
			set1.add(num);
		}
		for(int num:arr2) {
			set2.add(num);
		}
		for(int num:arr3) {
			set3.add(num);
		}
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);	
	}

}
