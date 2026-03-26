import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Address address = new Address("NN10 1AB", 12, "Rushden");
		User customer = new User(1, "jsmith", "John Smith", UserType.Customer, address);

		Inventory Inv = new Inventory();
		Inv.addProduct(new Keyboard(100001, "Logitech", "Black", ConnectivityType.Wireless,
				49.99, ProductCatagory.Keyboard, Layout.UK, KeyboardTypes.Standard));
		Inv.addProduct(new Mouse(100002, "Razer", "Black", ConnectivityType.Wired,
				29.99, ProductCatagory.Mouse, 7, MouseTypes.Gaming));

		int choice = 0;
		while (choice != 3) {
			System.out.println("\n1. View all products");
			System.out.println("2. Search by barcode");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			choice = scanner.nextInt();

			if (choice == 1) {
				for (Product p : Inv.getAllProducts()) {
					System.out.println(p);
				}
			} else if (choice == 2) {
				System.out.print("Enter barcode: ");
				int barcode = scanner.nextInt();
				Product result = Inv.findByBarcode(barcode);
				if (result != null) {
					System.out.println(result);
				} else {
					System.out.println("Product not found");
				}
			}
		}
		scanner.close();
	}

}
