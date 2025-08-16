package LogicalPrograms_Arrays;

import java.util.Stack;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		Stack s = new Stack();
		for(int i=0; i<a.length; i++) {
			s.push(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)s.pop();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
