package Method;

public class StaticMethod {
	
	 static int add(int a, int b){
		return a * b;
	}
	 
	static String add(String name){
		 return name;
	 }

	public static void main(String[] args) {
		int result = add(5,6);
		System.out.println(result);
		
		String n = add("Tony");
		System.out.println(n);

	}

}
