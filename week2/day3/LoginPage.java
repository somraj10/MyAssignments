package week2.day3;

public class LoginPage extends BasePage{
	
	public void performCommonTask(String text) {
		System.out.println("The performed task is: "+text);
	}

	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		l.performCommonTask("completed");
		l.findElement();
		l.clickElement();
		l.enterText();

	}

}
