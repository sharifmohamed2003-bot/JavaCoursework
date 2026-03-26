import java.util.ArrayList;
import java.util.List;
public class Inventory {
	private List<Product> stock = new ArrayList<>();

    public void addProduct(Product p) {
        stock.add(p);
    }

    public List<Product> getAllProducts() {
        return stock;
    }

    public Product findByBarcode(int barcode) {
        for (Product p : stock) {
            if (p.getBarcode() == barcode) return p;
        }
        return null;
    }
}
