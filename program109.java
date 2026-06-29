import java.util.Scanner;
public class program109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[5];
        boolean issued[] = new boolean[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter book name: ");
                        books[count] = sc.nextLine();
                        issued[count] = false;
                        count++;
                        System.out.println("Book added successfully");
                    } else {
                        System.out.println("Library full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + books[i] + 
                            " - " + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to issue: ");
                    int issue = sc.nextInt();
                    if (issue > 0 && issue <= count && !issued[issue - 1]) {
                        issued[issue - 1] = true;
                        System.out.println("Book issued successfully");
                    } else {
                        System.out.println("Book not available");
                    }
                    break;

                case 4:
                    System.out.print("Enter book number to return: ");
                    int ret = sc.nextInt();
                    if (ret > 0 && ret <= count && issued[ret - 1]) {
                        issued[ret - 1] = false;
                        System.out.println("Book returned successfully");
                    } else {
                        System.out.println("Invalid return");
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