package Method;

public class NonStaticMethod {
	
	public int add(int a, int b){
		return a+b;
	}


	public static void main(String[] args) {
		NonStaticMethod ns = new NonStaticMethod();
		int re = ns.add(8, 2);
		System.out.println(re);
	}

}
