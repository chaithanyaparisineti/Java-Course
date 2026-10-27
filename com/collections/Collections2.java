package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections2 {

	public static void main(String[] args) {
		Collection <String> c=new ArrayList<>();
		c.add("Chaithu");
		c.add("Zara");
		c.add("Noor");
		System.out.println(c.hashCode());
		
		Collection <Integer> c1=new ArrayList<>();
		c1.add(12);
		c1.add(15);
		c1.add(27);
		System.out.println(c1);
		
		Collection <Integer> c2=new ArrayList<>();
		c2.add(15);
		c2.add(12);
		c2.add(27);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
	}


