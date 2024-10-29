package week3.day2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character> unique = new HashSet<Character>();
		Set<Character> duplicates = new TreeSet<Character>();
		
		for (int i = 0; i < companyName.length(); i++) {
			boolean add = unique.add(companyName.charAt(i));
			if(!add) {
				duplicates.add(charArray[i]);
			
			}
			
		}
		System.out.println(unique);
		System.out.println(duplicates);

	}

}
