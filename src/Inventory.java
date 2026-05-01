import java.util.ArrayList;
import java.util.List;
public class Inventory {
	private List<Product> stock = new ArrayList<>();

    public void addProduct(Product p) { //add a product to the list
        stock.add(p);
    }

    public List<Product> getAllProducts() { // display all products
        return stock;
    }

    public Product findByBarcode(int barcode) { //find products via barcode
        for (Product p : stock) {
            if (p.getBarcode() == barcode) return p;
        }
        return null;
    }
}
