package LogicalPrograms_Arrays;

public class DuplicateElementOfAnArray {

	public static void main(String[] args) {
		// By using for loop
		int a[] = {1,2,3,3,4,5,4};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
