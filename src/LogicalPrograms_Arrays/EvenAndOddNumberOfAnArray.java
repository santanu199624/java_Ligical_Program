package LogicalPrograms_Arrays;

public class EvenAndOddNumberOfAnArray {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5,6};
//		System.out.println("Even Numbers: ");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 ==0) {
//				System.out.println(a[i]);
//			}
//		}
//		System.out.println("Odd Numbers are: ");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 != 0) {
//				System.out.println(a[i]);
//			}
//		}
		
		int[] a = {1,2,3,4,5,6};
		int even_num = 0;
		int odd_num = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				even_num ++;
			}else {
				odd_num ++;
			}
		}
		System.out.println(even_num);
		System.out.println(odd_num);

	}

}
