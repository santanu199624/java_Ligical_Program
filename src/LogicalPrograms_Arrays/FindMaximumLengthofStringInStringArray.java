package LogicalPrograms_Arrays;

import java.util.Arrays;

public class FindMaximumLengthofStringInStringArray {
	
	

	public static void main(String[] args) {
		String[] names = {"java", "automation", "manual", "python"};
		// Lamda expression
		String longestString = Arrays.stream(names).reduce((x, y) -> x.length() > y.length() ? x : y).get();
		System.out.println(longestString);
	}

}
