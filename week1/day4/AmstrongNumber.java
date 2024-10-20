package week1.day4;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=153, a=0, r, c;
		c=n;
		while(n>0) {
			r=n%10;
			a=(r*r*r)+a;
			n=n/10;
		}
		if(c==a) {
			System.out.println("Given number is an Armstrong number");
		}else {
			System.out.println("Given number is not an Armstrong number");
		}


	}

}
