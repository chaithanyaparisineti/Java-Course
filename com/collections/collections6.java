package com.collections;

import java.util.HashSet;
import java.util.Set;

//Count Vowels and Consonants Using Set
public class collections6 {
	public static void main(String[] args) {
		String str="hello world";
		Set<Character>vowels=new HashSet<>();
		Set<Character>consonants=new HashSet<>();
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
					vowels.add(ch);
				}else {
					consonants.add(ch);
				}
			}
		}
		System.out.println("vowels="+vowels.size());
		System.out.println("consonants="+consonants.size());
	}

}
