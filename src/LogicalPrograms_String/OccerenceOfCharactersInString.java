package LogicalPrograms_String;

import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
//import java.util.Map;

public class OccerenceOfCharactersInString {

	public static void main(String[] args) {
		String str = "aabbbc";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// Convert the String to char array
		// Character = key, Integer = value
		char[] cha = str.toCharArray();
		for(char ch: cha) {
			if(! map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				int count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);
		
		// using java8
//		str.chars().mapToObj(ch->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
	}

}
