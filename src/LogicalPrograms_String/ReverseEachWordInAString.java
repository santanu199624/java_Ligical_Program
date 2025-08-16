package LogicalPrograms_String;
import java.util.*;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String s = "This is bug";
		String[] word = s.split(" ");
		System.out.println(Arrays.toString(word));
		StringBuilder rev = new StringBuilder();
		for(int i=word.length-1; i>=0; i--) {
			rev.append(word[i]).append(" ");
		}
		String result = rev.toString().trim();
		System.out.println(result);

	}

}
