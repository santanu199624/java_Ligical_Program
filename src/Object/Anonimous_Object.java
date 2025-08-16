package Object;

public class Anonimous_Object {
	
	int add(int a, int b){
		return a+b;
	}

	public static void main(String[] args) {
		int result = new Anonimous_Object().add(5, 6);
		System.out.println(result);

	}

}
