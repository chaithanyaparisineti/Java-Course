package com.collections;
import java.util.HashMap;
import java.util.Scanner;
public class RomanNumbers {
	//RomanNumvers to integers 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter Input:");
		String roman=sc.next().toUpperCase();
		HashMap<Character,Integer>map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);	
		int result=0;
		for(int i=0;i<roman.length();i++) {
			int current=map.get(roman.charAt(i));
			if (i + 1 < roman.length() &&
				    current < map.get(roman.charAt(i + 1))) {
				    result -= current;
				} else {
				    result += current;
				}
		System.out.println("Integer:" + result);
		
		sc.close();
		}
		
	}
}


