package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
				
		int n = 11;
		boolean prime = true; 
		for (int i = 2; i <= (n-1); i++) {
			if (n%i == 0) {
				prime = false;
				
			}if (prime==true) {
				System.out.println("The number "+n+" is Prime");
				
			}
			else {
				System.out.println("The number "+n+" is not a Prime");
				
			}
			
		}

	}

}
