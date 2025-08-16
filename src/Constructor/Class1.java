package Constructor;

public class Class1 {
	String name;
	int emp_id;
	int age;
	
	 Class1(String name, int emp_id, int age){
		this.name = name;
		this.emp_id = emp_id;
		this.age = age;
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1("Krishna", 101, 20);
		System.out.println(c1.name);
		System.out.println(c1.emp_id);
		System.out.println(c1.age);
		
		Class1 c2 = new Class1("Madhav", 102, 30);
		System.out.println(c2.name);
		System.out.println(c2.emp_id);
		System.out.println(c1.age);
	}

}
