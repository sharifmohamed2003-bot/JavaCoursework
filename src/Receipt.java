
public class Receipt {
	
	private final String message;

    public Receipt(String message) {
        this.message = message;
    }


	@Override
    public String toString() {
        return message;
	}
	
}
