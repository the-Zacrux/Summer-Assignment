import java.util.Scanner;
public class program118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String books[] = new String[5];
        String author[] = new String[5];
        boolean issued[] = new boolean[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nMini Library System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter book name: ");
                        books[count] = sc.nextLine();
                        System.out.print("Enter author name: ");
                        author[count] = sc.nextLine();
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
                            System.out.println("Book: " + books[i] +
                                    " | Author: " + author[i] +
                                    " | Status: " + (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter book name to issue: ");
                    String issue = sc.nextLine();
                    boolean foundIssue = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(issue)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully");
                            } else {
                                System.out.println("Book already issued");
                            }
                            foundIssue = true;
                            break;
                        }
                    }

                    if (!foundIssue)
                        System.out.println("Book not found");
                    break;

                case 4:
                    System.out.print("Enter book name to return: ");
                    String ret = sc.nextLine();
                    boolean foundReturn = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(ret)) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book returned successfully");
                            } else {
                                System.out.println("Book was not issued");
                            }
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn)
                        System.out.println("Book not found");
                    break;

                case 5:
                    System.out.print("Enter book name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].equalsIgnoreCase(search)) {
                            System.out.println("Book: " + books[i]);
                            System.out.println("Author: " + author[i]);
                            System.out.println("Status: " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}