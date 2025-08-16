package LogicalPrograms_String;

public class ReverseAndPalindromString {

	public static void main(String[] args) {
		String str = "madam";
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println(revStr);
		if(revStr.equals(str)) {
			System.out.println(str+" is palindrome string");
		}else {
			System.out.println(str+" is not palindrome string");
		}

	}

}
