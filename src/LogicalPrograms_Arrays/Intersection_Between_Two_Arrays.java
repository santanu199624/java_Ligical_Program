package LogicalPrograms_Arrays;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Between_Two_Arrays {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {4,5,6,7,8};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
//		System.out.println(set);
		for(int i=0; i<b.length; i++) {
			if(set.contains(b[i])) {
				System.out.println(b[i]);
			}
		}

	}

}
