package week3.day1;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split = test.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		for (int i = 0; i < split.length; i++) {		
			String string = split[i];
			char[] charArray = string.toCharArray();
			
			if(i%2 !=0) {
				for (int j = string.length()-1; j>=0; j--) {
					System.out.print(charArray[j]);
				}
			}else {
				System.out.print(" "+split[i]+" ");
			}
			
		}
		
		

	}

}
