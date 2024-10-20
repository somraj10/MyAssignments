package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		
		int n=121;
		int reverse = 0;
		int temp = n;
		
		while(temp>0) {
			int reminder = temp%10;
			reverse = (reverse*10)+reminder;
			temp = temp/10;
		}
		
		if(reverse==n) {
			System.out.println("Given number is a palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}

	}

}
