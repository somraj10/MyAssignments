package week2.day3;

public class Polymor {
	
	public void  reportStep(String msg, String status) {
		System.out.println("Message: "+msg+" Status: "+status);
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message: "+msg+" Status: "+status+" Snap: "+snap);
	}

	public static void main(String[] args) {
		Polymor p = new Polymor();
		p.reportStep("Report Overview", "Completed");
		p.reportStep("Report Overview", "Inprogress", true);

	}

}
