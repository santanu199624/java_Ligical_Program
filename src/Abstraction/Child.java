package Abstraction;

 public class Child implements Parent {
	 public  void methodX() {
		  System.out.println("Method X");
		  this.methodY();
	  };
		
		public void methodY() {
			System.out.println("Method Y");
		};
		
		public static void main(String[] args) {
			Child obj = new Child();
			obj.methodX();
				
			
		}
}
