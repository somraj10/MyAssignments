package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "stop";
		String b = "post";

		if(a.length() == b.length()) {
			char[] charArray = a.toCharArray();
			char[] charArray2 = b.toCharArray();

			Arrays.sort(charArray);
			System.out.println(charArray);
			Arrays.sort(charArray2);
			System.out.println(charArray2);
			boolean equals = Arrays.equals(charArray, charArray2);

			if(equals==true) {
				System.out.println("The given strings are Anagram");
			}else {
				System.out.println("The given strings are not an Anagram");
			}

		}


	}

}
