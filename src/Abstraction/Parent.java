package Abstraction;

public interface Parent {
	
	abstract void methodX();
	
	abstract void methodY();
	
	 default void methodZ() {
		System.out.println("Method Z");
	};

}
