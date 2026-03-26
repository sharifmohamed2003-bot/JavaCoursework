
public class CreditCard implements PaymentMethod{
	private int cardNumber;
	private int securityCode;

	public CreditCard(int cardNumber, int securityCode) {
		this.cardNumber = cardNumber;
		this.securityCode = securityCode;
	}

	public int getCardNumber() {
		return this.cardNumber;
	}

	public int getSecurityCode() {
		return this.securityCode;
	}

	public void setCardNumber(int newCardNumber) {
		this.cardNumber = newCardNumber;
	}

	public void setSecurityCode(int newSecurityCode) {
		this.securityCode = newSecurityCode;
	}
	@Override
	public Receipt processPayment(double amount, Address address) {
		String message = amount + " paid by Credit Card using " + cardNumber +
				", and the delivery address is " + address.getHouseNum() +
				" " + address.getPostcode() + " " + address.getCity();
		return new Receipt(message);
	}
}
