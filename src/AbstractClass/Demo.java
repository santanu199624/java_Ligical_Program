package AbstractClass;

public class Demo {

	public static void main(String[] args) {
		Animal an;
		
		an = new Cow();
		an.sound();
		
		an = new Dog();
		an.sound();
		
		an = new Cat();
		an.sound();

	}

}
