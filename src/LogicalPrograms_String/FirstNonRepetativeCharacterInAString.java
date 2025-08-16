package LogicalPrograms_String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeCharacterInAString {

	public static void main(String[] args) {
//		String str = "programming";
		String str = "Hellow WorLd";
		String str1 = str.replaceAll("\\s+", "").toLowerCase();
		System.out.println(str1);
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map.get(ch) == null) {
				map.put(ch, 1);
			}else {
				int count = map.get(ch);
				map.put(ch, count + 1);
			}
		}
		System.out.println(map);
		
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(map.get(ch) == 3) {
				System.out.println(ch);
				break;
			}
		}

	}

}
