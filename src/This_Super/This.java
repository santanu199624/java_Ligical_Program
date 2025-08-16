package This_Super;

public class This {
//	int x;
	
//	static void method(int x){
////		this.x = x;
//		System.out.println(x);
//	}
//	
	// This keyword invoking current class method
	
	public void methodX(){
		System.out.println("methodX");
		this.methodY();
	}
	
	public void methodY(){
		System.out.println("methodY");
		this.methodZ();
	}
	
	public void methodZ(){
		System.out.println("methodZ");
	}
	
	public static void main(String[] args) {
		This obj = new This();
		obj.methodX();
	}
	

}
