
public class Keyboard extends Product{
	private Layout layout;
	private KeyboardTypes types;
	
	public Keyboard(int barcode, String brand, String color, ConnectivityType connnectivity, double retailPrice,
			ProductCatagory catagory, Layout layout, KeyboardTypes types) {
		super(barcode, brand, color, connnectivity, retailPrice, catagory);
		
		this.layout = layout;
		this.types = types;
	}
	
	public Layout getLayout() {
		return this.layout;
	}
	
	public KeyboardTypes getTypes() {
		return this.types;
	}
	
	@Override
	public String toString() {
	    return "Barcode: " + getBarcode() + ", Brand: " + getBrand() +
	           ", Color: " + getColor() + ", Connectivity: " + getConnectivity() +
	           ", Price: £" + getRetailPrice() + ", Category: " + getCatagory() +
	           ", Layout: " + layout + ", Type: " + types;
	}

}
