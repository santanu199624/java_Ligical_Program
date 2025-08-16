package Method;

public class MethodOverriding2 extends MethodOverriding {
	
	@Override
	public void makeSound(){
		System.out.println("Cat");
	}

	public static void main(String[] args) {
		
		
		MethodOverriding a = new MethodOverriding2();
		a.makeSound();
	}

}
