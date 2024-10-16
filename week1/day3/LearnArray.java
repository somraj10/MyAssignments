package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int num [] = {1,2,4,5,1,2,7,5,6};
		int arlength =num.length;
		System.out.println(arlength);
		
		Arrays.sort(num);
		System.out.println("The min value is: "+num[0]);
		
		for (int i = 0; i < arlength-1; i++) {
			if(num[i] == num[i+1]) {
				System.out.println(num[i]);
			}
		}
}
}
