package LogicalPrograms_String;

import java.util.HashMap;

public class JavaProgramtoFindLongestSubstringWithoutRepetition {
	
	// Length of substring
	public static int lengthOfLongestString(String str){
		int start = 0;
		int maxLength = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int end=0; end<str.length(); end++) {
			char curr = str.charAt(end);
			if(map.containsKey(curr)) {
				start = Math.max(start, map.get(curr) + 1);
			}
			map.put(curr, end);
			maxLength = Math.max(maxLength, end - start + 1);
		}
		return maxLength;
	}
	
	
	// Substring
	public static String longestUniqueSubstring(String str) {
	    int start = 0, maxLength = 0, maxStart = 0;
	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    for (int end = 0; end < str.length(); end++) {
	        char curr = str.charAt(end);
	        
	        if (map.containsKey(curr)) {
	            start = Math.max(start, map.get(curr) + 1);
	        }

	        map.put(curr, end);
	        
	        if (end - start + 1 > maxLength) {
	            maxLength = end - start + 1;
	            maxStart = start;
	        }
	    }
	        return str.substring(maxStart, maxStart + maxLength);
	    

	}
	
	public static void main(String[] args) {
		String input = "santanu";
		int ml = lengthOfLongestString(input);
		System.out.println(ml);
		 System.out.println("Substring: " + longestUniqueSubstring(input));

	}

}
