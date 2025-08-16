package LogicalPrograms_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateEleFromArray {

	public static void main(String[] args) {
		// By using Set
		int a[] = {1,2,4,2,5,3,3};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		// toArray() convert HashSet to Array
		// But the return type of toArray is Object . But we need integer
		Integer[] b = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));

	}

}
