package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str=sc.nextLine().toLowerCase();
		System.out.println("Enter a second String:");
		String str1=sc.nextLine().toLowerCase();
		ArrayList<Character>list1=new ArrayList<>();
		ArrayList<Character>list2=new ArrayList<>();
		for(char ch:str.toCharArray()) {
			list1.add(ch);
		}
		for(char ch:str1.toCharArray()) {
			list2.add(ch);
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.equals(list2)) {
		System.out.println("Anagrams");
	}else {
		System.out.println("Non Anagrams");
	}
sc.close();
	}
}