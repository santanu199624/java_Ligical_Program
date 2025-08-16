package Method;

public class Method_overloading1 {
	
	 int add(int a, int b){
		return a+b;
	}
	
	 int mul(int a, int b, int c){
		return a*b*c;
	}
	
	 double add(double a, double b){
		return a+b;
	}

	public static void main(String[] args) {
		Method_overloading1 ml = new Method_overloading1();
		System.out.println(ml.add(2.5, 3.5));
		System.out.println(ml.mul(5, 5, 5));
		System.out.println(ml.add(5, 5));

	}

}
