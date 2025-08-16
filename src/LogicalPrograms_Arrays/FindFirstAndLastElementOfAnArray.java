package LogicalPrograms_Arrays;

import java.util.ArrayList;

public class FindFirstAndLastElementOfAnArray {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		System.out.println(a.length);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		if(! list.isEmpty()) {
			int firstElement = list.get(0);
			int lastelement = list.get(list.size()-1);
			System.out.println(firstElement);
			System.out.println(lastelement);
		}
		

	}

}
