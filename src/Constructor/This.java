package Constructor;

public class This {
	
	// Instance variable
	String name;
	int age;

	public static void main(String[] args) {
		This s = new This("John", 30);
		s.display();

	}
	
	public This(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void display(){
		System.out.println("My name is "+name+" and my age is "+age);
	}

}
