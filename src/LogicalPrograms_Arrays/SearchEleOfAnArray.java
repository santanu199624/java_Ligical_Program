package LogicalPrograms_Arrays;

public class SearchEleOfAnArray {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		int searchEle = 50;
		for(int i=0; i<a.length; i++) {
			if(searchEle == a[i]) {
				System.out.println("Search Element is: "+i);
			}
		}

	}

}
