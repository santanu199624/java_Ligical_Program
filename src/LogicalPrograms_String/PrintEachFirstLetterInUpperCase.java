package LogicalPrograms_String;
import java.util.*;

public class PrintEachFirstLetterInUpperCase {

	public static void main(String[] args) {
		  String s = "this is a bug";
		 String[] words = s.split(" ");
		 for(String word: words) {
			String result = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			System.out.print(result+" ");
		 }

	        

	}

}
