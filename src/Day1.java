import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Day1 {

	public static void main(String[] args) {

//		System.out.println("dfhhj");
//		employee emp = new employee();
//		System.out.println(emp.name);
		Integer a[] = {20, 30, 40, 10, 20};
		System.out.println("Before sorting : "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("After sorting : "+Arrays.toString(a));
		
	}
	

}

//class employee {
//	String name = "Tony";
//	
////	Constructor
//	employee(){
//		System.out.println("Constructor called!");
//	}
//}

