package LogicalPrograms_Numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 123;
		int originalNum = num; // because num is changing in while loop.
		int cubeNum = 0;
		while(num > 0) {
			int rem = num % 10;
			cubeNum = cubeNum + (rem * rem * rem);
			num = num / 10;
		}
		if(originalNum == cubeNum) {
			System.out.println(originalNum+" is armstrong number");
		}else {
			System.out.println(originalNum+" is not armstrong number");
		}

	}

}
