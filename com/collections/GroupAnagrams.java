package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main (String[]args) {
		String[]arr= {"eat","tan","ate","nat","bat","tab"};
		Map<String,List<String>>map=new LinkedHashMap<>();
		for(String str:arr) {
			char[]chars=str.toCharArray();
			Arrays.sort(chars);
			String key=new String(chars);
			map.putIfAbsent(key,new ArrayList<>());
			map.get(key).add(str);
		}
		System.out.println(new ArrayList<>(map.values()));
	}

}
