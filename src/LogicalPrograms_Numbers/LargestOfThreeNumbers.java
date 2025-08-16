package LogicalPrograms_Numbers;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 10;
		if(a>b && a>c) {
			System.out.println(a+" is greater");
		}else if(b>c && b>a) {
			System.out.println(b+" is greater");
		}else {
			System.out.println(c+" is greater");
		}

	}

}
