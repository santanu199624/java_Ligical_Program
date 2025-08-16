package LogicalPrograms_String;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// 1. Same length after removing the space
		// 2. Character should be same despite of having different order
		String str1 = "BATB";
		String str2 = "TABB";
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map1.get(ch) == null) {
				map1.put(ch, 1);
			}else {
				int count = map1.get(ch);
				map1.put(ch, count + 1);
			}
		}
		System.out.println(map1);
		
		for(int i=0; i<str2.length(); i++) {
			char ch = str2.charAt(i);
			if(map2.get(ch) == null) {
				map2.put(ch, 1);
			}else {
				int count = map2.get(ch);
				map2.put(ch, count + 1);
			}
		}
		System.out.println(map2);
		if(map1.equals(map2)) {
			System.out.println("Both are anagrams");
		}else {
			System.out.println("Both are not anagrams");
		}

	}

}
