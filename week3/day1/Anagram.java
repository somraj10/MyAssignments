package week3.day1;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int a = text1.length();
		int b = text2.length();
		
		if (a == b) {
			char [] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			Arrays.sort(charArray);
			System.out.println(charArray);
			
			Arrays.sort(charArray2);
			System.out.println(charArray2);
			
			boolean equals = Arrays.equals(charArray, charArray2);
			
			
			if (equals == true) {
				System.out.println("The given strings are Anagram.");
			}else {
				System.out.println("The given strings are not an Anagram.");
			}
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
			
		}

	}


