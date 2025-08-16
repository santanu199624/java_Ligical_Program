package Constructor;

public class Class2 {
	int num;
	Class2(int num){
		this.num = num;
	}

	public static void main(String[] args) {
//		Class1 c = new Class1();
		Class2 c = new Class2(20);
		System.out.println(c.num);
		
		// No void because constructor only initialize the object.
		
		

	}

}
