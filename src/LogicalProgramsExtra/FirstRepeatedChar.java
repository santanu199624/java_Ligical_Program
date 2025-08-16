package LogicalProgramsExtra;
import java.util.*;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		// First repeat word
	/*	String name = "Programming";
		char[] cha = name.toCharArray();
		Set<Character> set = new HashSet<Character>();
//		System.out.println(charArray);
		for(char ch: cha) {
			if(set.contains(ch)) {
				System.out.println("First repeated character :"+ch);
				break;
			}
			set.add(ch);
		}
	} */
		
		// Last repeat word
		String word = "programming";
		word = new StringBuffer(word).reverse().toString();
		char[] cha = word.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for(char ch: cha) {
			if(set.contains(ch)) {
				System.out.println(ch);
				break;
			}
			set.add(ch);
		}
		
	
	}

}
