package LogicalPrograms_String;

public class VowelsAndConsonent {

	public static void main(String[] args) {
		String str = "java";
		char[] ch = str.toCharArray();
		int count = 0;
		for(char c: ch) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println(count);

	}

}
