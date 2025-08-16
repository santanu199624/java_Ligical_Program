package This_Super;

public class InvokeCurrentClassObject {
	
	// Instance variable
	int a;
	int b;
	
	public InvokeCurrentClassObject(){
		
				a = 2;
				b = 3;
	}
	
	void display() {
		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	InvokeCurrentClassObject currentClassObject(){
		return this;
	}

}
