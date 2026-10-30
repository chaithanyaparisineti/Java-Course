package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Find Missing Numbers Using Set..?
public class collections7 {

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,7,8,11};
		Set<Integer>set=new HashSet<>();
		for(int num:arr) {
			set.add(num);
		}
List<Integer>missing=new ArrayList<>();
for (int i = 1; i <= 11; i++) {

    if (!set.contains(i)) {
        missing.add(i);
    }
}

System.out.println("Missing numbers: " + missing);
}
}