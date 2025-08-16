package Leetcode;

public class Palindrome {

	
	public static void main(String[] args) {
		int num = 1211;
		int x = num;
		int rev  = 0;
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if(x == rev) {
			System.out.println(x+" is palindrome number");
		}else {
			System.out.println(x+" is not palindrome number");
		}

	}

}
