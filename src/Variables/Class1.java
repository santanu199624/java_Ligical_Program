package Variables;

public class Class1 {

	 static int num = 20; // instance variable

	void m1() {
		 int n1 = 10; // Local variable
		 int num1 = 50;
		System.out.println(num);
	}

	void m2() {
		int m2 = 30;
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.m1();
	}

}
