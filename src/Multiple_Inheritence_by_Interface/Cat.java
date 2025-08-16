package Multiple_Inheritence_by_Interface;

public class Cat implements Dog {
	 public void eat() {
		 System.out.println("Animal eat");
	 }
	 
	 public void bark() {
		 System.out.println("Dog bark");
	 }

	public static void main(String[] args) {
		Cat c = new Cat();
		c.bark();
		c.eat();

	}

}
