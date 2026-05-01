import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Address address = new Address("NN10 1AB", 12, "Rushden");
		User customer = new User(1, "jsmith", "John Smith", UserType.Customer, address);

		Inventory Inv = new Inventory();
		Inv.addProduct(new Keyboard(123123, "Logitech", "Black", ConnectivityType.Wireless,
				32.00, ProductCatagory.Keyboard, Layout.US, KeyboardTypes.Flexible));
		Inv.addProduct(new Mouse(112233, "Logitech", "Black", ConnectivityType.Wireless,
				25.50, ProductCatagory.Mouse, 5, MouseTypes.Gaming));
		Inv.addProduct(new Keyboard(123456, "Corsair", "Black", ConnectivityType.Wired,
				39.99, ProductCatagory.Keyboard, Layout.UK, KeyboardTypes.Gaming));
		Inv.addProduct(new Mouse(345345, "Advent", "Black", ConnectivityType.Wireless,
				25.50, ProductCatagory.Mouse, 5, MouseTypes.Gaming));
		
		System.out.println("Welcome " + customer.getName() + "\n\nplease choose an option:");
		
		
		int choice = 0;
		while (choice != 3) {//display 3 choices, if choice 3 program ends
			System.out.println("\n1. View all products");
			System.out.println("2. Search by barcode");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			choice = scanner.nextInt();

			if (choice == 1) { //prints all stock
				for (Product p : Inv.getAllProducts()) {
					System.out.println(p);
				}
			} else if (choice == 2) { // search by barcode
				System.out.print("Enter barcode: ");
				int barcode = scanner.nextInt();
				Product result = Inv.findByBarcode(barcode);
				if (result != null) {// if code doesnt exist return "not found"
					System.out.println(result);
				} else {
					System.out.println("Product not found");
				}
			}
		}
		scanner.close();
	}

}
