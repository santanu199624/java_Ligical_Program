package Multi_Level_Interface;

public class Cat extends Dog{
	public void meow(){
		System.out.println("meo");
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.bark();
//		c.eat();
	}
}
