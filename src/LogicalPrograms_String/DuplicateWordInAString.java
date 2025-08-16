package LogicalPrograms_String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordInAString {

	public static void main(String[] args) {
		String str = "I am am am Coder now now now";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		Set<String> set = new LinkedHashSet<String>();
		for(String word: words) {
			set.add(word);
		}
		String result = String.join(" ", set);
		System.out.println(result);
		String s = "santanu maity";
		String[] r = s.split(" ");
		System.out.println(Arrays.toString(r));

	}

}
