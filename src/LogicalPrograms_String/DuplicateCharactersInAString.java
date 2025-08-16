package LogicalPrograms_String;

import java.util.LinkedHashSet;
import java.util.*;
import java.util.Set;

public class DuplicateCharactersInAString {

	public static void main(String[] args) {
//		String str = new String("Automation");
//		char[] ch = str.toCharArray();
////		int count = 0;
//		for(int i=0; i<ch.length; i++) { // 1st for loop iterate entire characters
//			for(int j=i+1; j<ch.length; j++) {
//				if(ch[i] == ch[j]) {
//					System.out.println(ch[j]);
////					count ++;
//				}
//			}
//		}

		String input = "santanu";
		String[] words = input.split("");
		System.out.println(Arrays.toString(words));
		Set<String> set = new LinkedHashSet<String>();
		for (String word : words) {
			set.add(word);
		}
		String result = String.join(" ", set);
		System.out.println(result);

	}

}
