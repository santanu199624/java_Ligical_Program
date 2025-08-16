package Exception;

public class Arithmetic_Exception {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 2;
		int d = 5;
		
		System.out.println(a / d);
		try {
			System.out.println(a / b);
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Division by zero is not result!");
		}
		System.out.println(a / c);
	}

}
