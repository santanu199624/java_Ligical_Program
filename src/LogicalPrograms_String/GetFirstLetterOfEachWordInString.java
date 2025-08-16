package LogicalPrograms_String;

import java.util.Arrays;

public class GetFirstLetterOfEachWordInString {

	public static void main(String[] args) {
		String s = "this is bug";
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			System.out.println(word.charAt(0));
		}

	}

}
