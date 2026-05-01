
public class CreditCard implements PaymentMethod{
	private int cardNumber;
	private int securityCode;
	private static final int cardNumLength = 6;
    private static final int securityCodeLength = 3;

    public CreditCard(int cardNumber, int securityCode) {
        if (String.valueOf(cardNumber).length() != cardNumLength) {
            throw new IllegalArgumentException("Card number must be " + cardNumLength + " digits");
        }
        if (String.valueOf(securityCode).length() != securityCodeLength) {
            throw new IllegalArgumentException("Security code must be " + securityCodeLength + " digits");
        }
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
    public final Receipt processPayment(double amount, Address address) {
        String message = amount + " paid by Credit Card using " + cardNumber +
                ", and the delivery address is " + address.getHouseNum() +
                " " + address.getPostcode() + " " + address.getCity();
        return new Receipt(message);
    }
}
