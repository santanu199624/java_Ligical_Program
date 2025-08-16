package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
//		String[] s = {"Red", "Pink", "Blue"};
//		List list = Arrays.asList(s);
//		System.out.println(list);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int s1: a) {
			list.add(s1);
		}
		System.out.println(list);

	}

}
