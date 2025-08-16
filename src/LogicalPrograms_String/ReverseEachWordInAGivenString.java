package LogicalPrograms_String;

public class ReverseEachWordInAGivenString {

	public static void main(String[] args) {
		String  str = "I love my India";
		String[] word =  str.split(" ");
		String revStr = "";
		for(String w: word) {
			String revWord = "";
			for(int i=w.length()-1; i>=0; i--) {
				revWord = revWord + w.charAt(i);
			}
			revStr = revStr + revWord + " ";
		}
		System.out.println(revStr);

	}

}
