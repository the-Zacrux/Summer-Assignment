import java.util.Scanner;
public class program116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product[] = new String[5];
        int quantity[] = new int[5];
        int price[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter product name: ");
                        product[count] = sc.nextLine();
                        System.out.print("Enter quantity: ");
                        quantity[count] = sc.nextInt();
                        System.out.print("Enter price: ");
                        price[count] = sc.nextInt();
                        count++;
                        System.out.println("Product added successfully");
                    } else {
                        System.out.println("Inventory full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No products available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Product: " + product[i] +
                                    " Quantity: " + quantity[i] +
                                    " Price: " + price[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter product name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (product[i].equalsIgnoreCase(search)) {
                            System.out.println("Product: " + product[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter product name to update: ");
                    String update = sc.nextLine();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (product[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter new quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity updated");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Product not found");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}