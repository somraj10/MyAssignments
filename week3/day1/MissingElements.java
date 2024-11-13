package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElements {

	public static void main(String[] args) {
		int[] a ={1, 2, 3, 4, 10, 6, 8};
		
		List <Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("The missing elements are: ");
		for (int i = 0; i < a.length-1; i++) {
			
				if ((list.get(i)+1) != list.get(i+1)) {
					System.out.println(list.get(i)+1);
					
				}
			
		}

	}

}
