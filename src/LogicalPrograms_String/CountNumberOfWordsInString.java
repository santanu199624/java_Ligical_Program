package LogicalPrograms_String;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "santanu";
		int count = 0;
//		System.out.println(str.length());
		for(int i=str.length()-1; i>=0; i--) {
			count ++;
		}
		System.out.println(count);

	}

}
