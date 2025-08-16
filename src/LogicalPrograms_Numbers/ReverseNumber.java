package LogicalPrograms_Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 121;
		int revNum = num;
		int rev = 0;
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if(revNum == rev) {
			System.out.println(revNum+" is palindrome number");
		}else {
			System.out.println(revNum+" is not palindrome number");
		}

	}

}
