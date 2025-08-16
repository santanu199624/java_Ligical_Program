package MultipleInheritence;

public class ClassC implements ClassA, ClassB {
	
	public void methodX() {
		System.out.println("Method X");
	}
	
	public void methodY() {
		System.out.println("Method Y");
	}

	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.methodX();
		obj.methodY();

	}

}
