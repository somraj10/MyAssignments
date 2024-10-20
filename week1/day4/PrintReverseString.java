package week1.day4;

public class PrintReverseString {

	public static void main(String[] args) {
		
		String name = "Somraj";
		char[] charArray = name.toCharArray();
		//char charAt = name.charAt(5);
		//System.out.println(charAt);
		
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
