package Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet<Integer> setA = new HashSet<Integer>();
//		HashSet<Integer> setB = new HashSet<Integer>();
//		setA.add(0);
//		setA.add(2);
//		setA.add(4);
//		setA.add(6);
//		setA.add(8);
//		
//		setB.add(1);
//		setB.add(2);
//		setB.add(3);
//		setB.add(4);
//		setB.add(5);
		
		// Unioun of two sets
//		setB.addAll(setA);
//		System.out.println(setB);
		
		// Intersection
//		setB.retainAll(setA);
//		System.out.println(setB);
		
		// Difference between two set
//		setA.removeAll(setB);
//		System.out.println(setB);
		
		int[] a = {1,2,3,4,5};
		int[] b = {3,4,5};
		HashSet<Integer> set1 = new HashSet<Integer>();
		for(int s1: a) {
			set1.add(s1);
		}
		
		System.out.println(set1.contains(4));
		System.out.println(set1.size());
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int s2: b) {
			set2.add(s2);
		}
//		System.out.println(set2);
		
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set1.containsAll(set2));
	}

}
