package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class collections3 {

	public static void main(String[] args) {
		Collection<Integer>c=new ArrayList<>();
		//c.add(9);
		if(c.isEmpty()) {
			c.add(45);
			c.add(15);
			c.add(12);
			c.add(18);	
		}
System.out.println(c);
	}

}
