package week1.day3;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		int version = 10;
		if (version>0) {
			System.out.println("The given number "+version+" is positive");
		}else if(version<0) {
			System.out.println("The given number "+version+" is negavite");
		}else {
			System.out.println("The given number "+version+" is neutral");
		}

	}

}
