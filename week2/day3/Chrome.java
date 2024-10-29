package week2.day3;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Open incognito"+"Browser Name: "+browserName+" Browser  Version: "+browserVersion);
	}
	public void clearCache() {
		System.out.println("Clear caches");
	}

	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.openIncognito();
		c.clearCache();

	}

}
