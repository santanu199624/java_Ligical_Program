package Collection;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Tony");
		li.add("Thor");
		li.add("Luke");
		li.add("John");
		li.add(2, "Stuart");
		System.out.println(li);
		
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Suzuki");
		cars.add("BMW");
		System.out.println("Before adding addFirst method"+cars);
		cars.addFirst("Ford");
		System.out.println("After adding addFirst method"+cars);
		cars.addLast("Maruti");
		System.out.println("After adding addLast method"+cars);
		cars.removeFirst();
		System.out.println("After remove first element"+cars);
		cars.removeLast();
		System.out.println("After remove last element"+cars);
		System.out.println("After remove last element"+cars);
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		cars.push("Audi");
		System.out.println("After push method"+cars);
		cars.pop();
		System.out.println("After pop method"+cars);

	}

}
