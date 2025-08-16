package Method;

public class ClassB extends ClassA {
	
	public void method(int a){
		System.out.println("Class B method"+a);
	}
	
	public static void main(String[] args) {
		ClassB ob = new ClassB();
		ob.method(20);
	}

}
