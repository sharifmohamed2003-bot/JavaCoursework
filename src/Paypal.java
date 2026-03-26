
public class Paypal implements PaymentMethod {

	private String email;
	
	public Paypal(String email) {
		  this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	@Override
	public Receipt processPayment(double amount, Address address) {
		String message = amount + " paid by PayPal using " + email +
				", and the delivery address is " + address.getHouseNum() +
				" " + address.getPostcode() + " " + address.getCity();
		return new Receipt(message);
	}


}
