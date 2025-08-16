package Abstraction;

 class ClassB extends ClassA {
	 
	 @Override
	 void methodA() {
		 System.out.println("Method A");
		 this.methodB();
	 }
	 
	 @Override
	 void methodB() {
		 System.out.println("Method B");
	 }
	 
	 public static void main(String[] args) {
		 ClassB obj = new ClassB();
		 obj.methodA();
		 obj.methodC();
	}
}
