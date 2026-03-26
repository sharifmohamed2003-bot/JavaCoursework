
public abstract class Product {
	private int barcode;
	private String brand;
	private String color;
	private ConnectivityType connectivity;
	private double retailPrice;
	private ProductCatagory catagory;
	
	public Product(int barcode, String brand, String color, ConnectivityType connnectivity, double retailPrice, ProductCatagory catagory) {
		this.barcode = barcode;
		this.brand = brand;
		this.connectivity = connnectivity;
		this.color = color;
		this.retailPrice = retailPrice;
		this.catagory = catagory;
	}
	public int getBarcode() {
		return this.barcode;
	}
	public String getBrand() {
		return this.brand;
	
	}
	public String getColor() {
		return this.color;
	}
	public ConnectivityType getConnectivity() {
		return this.connectivity;
	}
	public double getRetailPrice() {
		return this.retailPrice;
	}
	public ProductCatagory getCatagory() {
		return this.catagory;
	}
	@Override
	public abstract String toString();
	
}
