package week2.day3;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint request is: "+endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The endpoint request is: "+endpoint+" Description: "+requestBody+" Status: "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("Testleaf");
		api.sendRequest("Testleaf", "Selenium Course", true);
		

	}

}
