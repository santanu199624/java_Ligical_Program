package LogicalPrograms_Arrays;

public class InsertElementInAnArrayAtSpecificPosition {

	public static void main(String[] args) {
		
		
		// This is for the position
//		int pos = 5;
//		int element = 100;
//		for(int i=arr.length-1; i>pos-1; i--) {
//			arr[i] = arr[i-1];
//		}
//		arr[pos - 1] = element;
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		// If index position
		int[] arr = {10,20,30,40,50,60,70,80};
		int index_pos = 5;
		int element = 100;
		for(int i=arr.length-1; i>index_pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[index_pos] = element;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
