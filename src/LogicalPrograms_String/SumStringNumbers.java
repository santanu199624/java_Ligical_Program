package LogicalPrograms_String;

public class SumStringNumbers {

	public static void main(String[] args) {
		String num = " 1 2 3 ";
		
		// Step 1: Trim and split the string
		String[] parts = num.trim().split(" ");   // splits by one or more spaces
		
		// Sum the numbers
		int sum = 0;
		for(String part: parts) {
			sum += Integer.parseInt(part);  // Convert to int and add
		}
		
		System.out.println(sum);

	}

}
