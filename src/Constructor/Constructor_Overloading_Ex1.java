package Constructor;

public class Constructor_Overloading_Ex1 {
	
	int age;
	String name;
	String job;
	
	Constructor_Overloading_Ex1(){
		this.age = 0;
		this.name = "Unknown";
	}
	
	Constructor_Overloading_Ex1(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	Constructor_Overloading_Ex1(int age, String name, String job){
		this.age = age;
		this.name = name;
		this.job = job;
	}
	
	void display(){
		System.out.println(age+" "+name+" "+job);
	}

	public static void main(String[] args) {
		Constructor_Overloading_Ex1 co = new Constructor_Overloading_Ex1();
		co.display();
		
		Constructor_Overloading_Ex1 co1 = new Constructor_Overloading_Ex1(20, "Tony");
		co1.display();
		
		Constructor_Overloading_Ex1 co2 = new Constructor_Overloading_Ex1(20, "Rock", "Super");
		co2.display();

	}

}
