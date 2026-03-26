
public class Mouse extends Product{
	private int buttons;
	private MouseTypes types;
	public Mouse(int barcode, String brand, String color, ConnectivityType connnectivity, double retailPrice,
			ProductCatagory catagory, int buttons, MouseTypes types) {
		super(barcode, brand, color, connnectivity, retailPrice, catagory);
		this.buttons = buttons;
		this.types = types;
	}
	public int getButtons() {
		return this.buttons;
	}
	public MouseTypes getTypes() {
		return this.types;
	}
	@Override
	public String toString() {
	    return "Barcode: " + getBarcode() + ", Brand: " + getBrand() +
	           ", Color: " + getColor() + ", Connectivity: " + getConnectivity() +
	           ", Price: £" + getRetailPrice() + ", Category: " + getCatagory() +
	           ", Buttons: " + buttons + ", Type: " + types;
	}
	
}
