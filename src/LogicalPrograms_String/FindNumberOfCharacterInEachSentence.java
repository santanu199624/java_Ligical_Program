package LogicalPrograms_String;

import java.util.Arrays;

public class FindNumberOfCharacterInEachSentence {

	public static void main(String[] args) {
		String s = "Helo world";
		String[] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		for(String word: words) {
			System.out.println(word.length());
		}

	}

}
