package week2.day3;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	public void fullScreenMode() {
		System.out.println("Full Scren Mode");
	}

	public static void main(String[] args) {
		
		Safari s = new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openURL();
		s.closeBrowser();

	}

}
