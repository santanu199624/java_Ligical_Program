package LogicalPrograms_String;

//import java.util.LinkedList;

public class Subbu123rajOutputSubburaj123 {

	public static void main(String[] args) {
		
//		  String str = "Subburaj1234raj"; 
//		  char[] cha = str.toCharArray(); 
//		  StringBuilder alphaPart = new StringBuilder(); 
//		  StringBuilder numericPart = new StringBuilder(); 
//		  for(char ch : cha) { 
//			  if(Character.isLetter(ch)) {
//		  alphaPart.append(ch);
//		  } else if (Character.isDigit(ch)) {
//		  numericPart.append(ch);
//		  }
//			  }
//		  System.out.println(alphaPart.toString());
//		  System.out.println(numericPart.toString());
		 
		
		
		//2. Java program to gives two Output:  “abcde”, “ABCDE” for the Input  String Str = “aBACbcEDed” 
		
//		String str = "aBbAcC";
//		char[] cha = str.toCharArray();
//		StringBuilder lowerCase =  new StringBuilder();
//		StringBuilder upperCase =  new StringBuilder();
//		for(char ch: cha) {
//			if(Character.isLowerCase(ch)) {
//				lowerCase.append(ch);
//			}else if(Character.isUpperCase(ch)){
//				upperCase.append(ch);
//			}
//		}
//		System.out.println(lowerCase);
//		System.out.println(upperCase);
		
		// 3. Java program to gives Output:  “32412120000” for the Input  String Str = “32400121200”
		
		String input = "32400121200";
		char[] inch = input.toCharArray();
		System.out.println(inch);
		StringBuilder nonZero = new StringBuilder();
		StringBuilder zero = new StringBuilder();
		
		for(char ch: inch) {
			if(ch == '0') {
				zero.append(ch);
			}else {
				nonZero.append(ch);
			}
		}
		String result = nonZero.append(zero).toString();
		System.out.println(result);
		
       
//		}
		
		// Write a program to move all the zero into the right portion
		
//		int[] a = {0,1,0,2,4};
//		LinkedList li = new LinkedList();
//		for(int i=0; i<a.length; i++) {
//			if(a[i] == 0) {
//				li.addFirst(a[i]);
//			}else {
//				li.addLast(a[i]);
//			}
//		}
//		System.out.println(li);
		

	}

}
