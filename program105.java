import java.util.Scanner;
public class program105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int roll[] = new int[5];
        int marks[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        sc.nextLine();
                        System.out.print("Enter name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter roll number: ");
                        roll[count] = sc.nextInt();
                        System.out.print("Enter marks: ");
                        marks[count] = sc.nextInt();
                        count++;
                        System.out.println("Student added successfully");
                    } else {
                        System.out.println("Record full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + name[i] +
                                    " Roll: " + roll[i] +
                                    " Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == search) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Roll: " + roll[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}