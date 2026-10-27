package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collections4 {

	public static void main(String[] args) {
		Collection <String> names=new ArrayList<>();
		names.add("Virat");
		names.add("Dhoni");
		names.add("jadeja");
		names.add("Rohith");
		
		Object[]obj=names.toArray();
		for(Object ob:obj) {
			System.out.println(ob);
		}for(String name:names) {
			System.out.println(name);
		}
		System.out.println("******************");
		Iterator <String> itr=names.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    String name=itr.next();
	    if(name.equals("jadeja")) {
	    	itr.remove();
	    }
	    System.out.println(names);
	}
}
