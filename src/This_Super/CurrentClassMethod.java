package This_Super;

public class CurrentClassMethod {
	
	void methodX(){
		methodY(this);
	}
	
	void methodY(CurrentClassMethod obj){
		System.out.println("Current class method calling");
	}

}
