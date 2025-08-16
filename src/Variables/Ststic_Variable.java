package Variables;

public class Ststic_Variable {
	
	int age; 		// instance variable
	String name;	// instance variable
	static String college = "ABC"; // static variable
	
	public Ststic_Variable(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void display(){
		System.out.println(age+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Ststic_Variable sv = new Ststic_Variable(20, "John");
		sv.display();

	}

}
