package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(20.5);
		list.add(true);
		list.add("Radhe");
		list.add("K");
		list.add(100);
		list.add(" ");
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(1, "Hellow");
		
		// Here add() is the method overload  
		
//		for(int i=0; i<list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
		
		for(Object x: list) {
			System.out.println(x);
		}
		
//		System.out.println(list.size());
//		list.remove(5);
//		System.out.println(list);
		
//		int[] a = {1,2,3,4,2,1};
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] == a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}

	}

}
