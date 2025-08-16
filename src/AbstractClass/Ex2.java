package AbstractClass;

public class Ex2 extends Ex1 {
	
	@Override
	void method1(){
		System.out.println("Method1");
		this.method2();
	}
	
	@Override
	void method2(){
		System.out.println("Method2");
		this.method3();
	}
	
	public static void main(String[] args) {
		 Ex2 e = new Ex2();
		 e.method1();
	}

}
