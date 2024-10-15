package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {

		System.out.println("Odd numbers between 1 to 10 are:");
		int maxRange = 10;
		for(int i=1; i<= maxRange; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}

	}

}
