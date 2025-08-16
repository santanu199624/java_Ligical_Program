package LogicalPrograms_Arrays;

import java.util.HashSet;

public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
//		//By using for loop
//		int a[] = {1,2,3,4,5};
//		int b[] = {4,5,6,7,8};
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<b.length; j++) {
//				if(a[i] == b[j]) {
//					
//					System.out.println("Common Elements are :"+a[i]);
//				}
//			}
//		}
		
		// By using th Hashset
		int a[] = {1,2,3,4,5,4};
		int b[] = {4,5,6,7,8,8};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
					hs.add(a[i]);
				}
			}
		}
		for(int dn: hs) {
			System.out.println(dn);
		}

	}

}
