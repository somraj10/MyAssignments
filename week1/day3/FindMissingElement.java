package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		//Initializing an array
		int a[] = {1,4,3,2,8,6,7};
		//Finding the length of an array
		int alength = a.length;
		System.out.println(alength);
		//Sorting an array
		Arrays.sort(a);
		System.out.println("The second minimum value in the array is: "+a[1]);

		//Finding the missing value
		System.out.println("The missing value is: ");
		for (int i = 0; i < alength; i++) {
			if (a[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

	}

}


