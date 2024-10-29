package week2.day4;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("Payment Method: Cash On Delivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("Payment Method: UPI");
	}

	@Override
	public void cardPayments() {
		System.out.println("Payment Method: Debit Card");	
	}

	@Override
	public void internetBanking() {
		System.out.println("Payment Method: Internet Banking");	
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Payment Details Recorded");	
	}
	
	public static void main(String[] args) {
		
		Amazon a = new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();

	}

}
