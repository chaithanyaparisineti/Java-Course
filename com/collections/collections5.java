package com.collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
public class collections5 {
	public static void main(String[] args) {

   // Create CopyOnWriteArrayList
   CopyOnWriteArrayList<String> cart = new CopyOnWriteArrayList<>();

	 // 1. Add products
   cart.add("Laptop");
   cart.add("Mouse");
   cart.add("Keyboard");
   cart.add("Monitor");
   // 2. Create iterator before modifying the list
   Iterator<String> oldIterator = cart.iterator();

   // 3. Modify the list
   cart.add("Headphones");
   cart.remove("Mouse");

   // 4. Print elements using the old iterator
   System.out.println("Using old iterator:");
   while (oldIterator.hasNext()) {
       System.out.println(oldIterator.next());
   }    
   System.out.println("************************");
// 5. Create a new iterator
   Iterator<String> newIterator = cart.iterator();

   System.out.println("Using new iterator:");
   while (newIterator.hasNext()) {
       System.out.println(newIterator.next());
      }
   }
}

		        