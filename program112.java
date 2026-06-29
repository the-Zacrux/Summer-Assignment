import java.util.Scanner;
public class program112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        String phone[] = new String[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter phone number: ");
                        phone[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact added successfully");
                    } else {
                        System.out.println("Contact list full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + name[i] + " Phone: " + phone[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Phone: " + phone[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    String del = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(del)) {
                            for (int j = i; j < count - 1; j++) {
                                name[j] = name[j + 1];
                                phone[j] = phone[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Contact deleted");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Contact not found");
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