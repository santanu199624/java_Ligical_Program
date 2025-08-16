package LogicalPrograms_Arrays;

import java.util.Arrays;

public class SortElementsInAnArray {

	public static void main(String[] args) {
		int[] a = {4,3,1,5,2};
//		System.out.println("Before sorting :"+Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			
			System.out.print(a[i]+" ");
		}

	}

}
