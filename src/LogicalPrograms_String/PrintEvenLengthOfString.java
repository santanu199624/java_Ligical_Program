package LogicalPrograms_String;

import java.util.Arrays;

public class PrintEvenLengthOfString {

	public static void main(String[] args) {
		String str = "Helo World Fine";
		String[] s = str.split(" ");
		System.out.println(Arrays.toString(s));
		for(String c: s) {
			if(c.length() % 2 == 0) {
				System.out.println(c);
			}
		}

	}

}
