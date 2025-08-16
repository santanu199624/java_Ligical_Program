package Super;

public class ClassB extends ClassA {

	int a = 3;
	
	void methodX(){
		System.out.println("Method X from Class B");
	}
	
	void methodY(){
		super.methodX();
		System.out.println(super.a);
	}
}
