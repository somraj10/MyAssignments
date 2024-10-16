package week1.day3;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int a=13;
		boolean prime = true;
	
		
		for (int i = 2; i < a-1; i++) {
			if(a%i==0) {
				prime = false;
				break;
			}if(prime==true) {
				System.out.println("The given number "+a+" is a prime");
				
			}else {
				System.out.println("The given number "+a+"is not a prime");
			}
		}

	}

}
