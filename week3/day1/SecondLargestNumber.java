package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] a = {3, 2, 11, 4, 6, 7};
		List <Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		
		System.out.println(list);
		
		//Second Largest Number
				int size2 = list.size();
				
				System.out.println("The second largest number in the given array is: "+list.get(size2-2));


	}

}
