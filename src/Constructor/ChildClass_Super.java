package Constructor;

public class ChildClass_Super extends ParentClass_Super {
	
	
	
	ChildClass_Super(){
		System.out.println("This is child constructor without arg");
	}
	
	ChildClass_Super(String name){
		super(6,3);
		System.out.println("This is child constructor with arg");
	}

}
