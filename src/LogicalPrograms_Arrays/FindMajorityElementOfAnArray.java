package LogicalPrograms_Arrays;

public class FindMajorityElementOfAnArray {

	public static void main(String[] args) {
		
		int[] a = {2,2,1,1,1,2,2,};
		int majority = 0;
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(count == 0) {
				majority = a[i];
			}
			if(majority == a[i]) {
				count++;
			}else {
				count--;
			}
		}
		System.out.println(majority);
	}

}
