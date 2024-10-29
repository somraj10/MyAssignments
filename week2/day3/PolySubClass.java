package week2.day3;

public class PolySubClass extends Polymor {
	
	public void reportStep(int noOfReports) {
		System.out.println("Rports Completed: "+noOfReports);
	}

	public static void main(String[] args) {
		PolySubClass po = new PolySubClass();
		po.reportStep(5);

	}

}
