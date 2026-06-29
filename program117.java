import java.util.Scanner;
public class program117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int roll[] = new int[5];
        String course[] = new String[5];
        int marks[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nStudent Record System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter roll number: ");
                        roll[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter course: ");
                        course[count] = sc.nextLine();
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
                                    " Course: " + course[i] +
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
                            System.out.println("Course: " + course[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student not found");
                    break;

                case 4:
                    System.out.print("Enter roll number to update marks: ");
                    int update = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == update) {
                            System.out.print("Enter new marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks updated");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Student not found");
                    break;

                case 5:
                    System.out.print("Enter roll number to delete: ");
                    int del = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == del) {
                            for (int j = i; j < count - 1; j++) {
                                name[j] = name[j + 1];
                                roll[j] = roll[j + 1];
                                course[j] = course[j + 1];
                                marks[j] = marks[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Student record deleted");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Student not found");
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