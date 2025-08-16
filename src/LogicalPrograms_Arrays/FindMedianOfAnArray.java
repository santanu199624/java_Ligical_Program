package LogicalPrograms_Arrays;

import java.util.Arrays;

public class FindMedianOfAnArray {

	public static void main(String[] args) {
		int[] a = {2,5,1,7};
		Arrays.sort(a);
		if(a.length % 2 != 0 ) {
			int index = a.length / 2;
			System.out.println(a[index]);
		}else {
			int index = a.length / 2;
			double md = (double)(a[index] + a[index - 1]) / 2;
			System.out.println(md);
		}
		

	}

}
