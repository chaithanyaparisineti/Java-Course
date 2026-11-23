package StringHandling;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str="banana";
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}

}
