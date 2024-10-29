package week2.day4;

public class JavaConnection implements DatabseConnection {


	@Override
	public void connect() {
		System.out.println("It is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("It is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}
	
	public static void main(String[] args) {
		JavaConnection db = new JavaConnection();
		db.connect();
		db.disconnect();
		db.executeUpdate();
	}

}
