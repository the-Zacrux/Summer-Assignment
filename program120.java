import java.util.Scanner;
public class program120 {
    static String name[] = new String[5];
    static int roll[] = new int[5];
    static int marks[] = new int[5];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        if (count < 5) {
            System.out.print("Enter name: ");
            name[count] = sc.nextLine();
            System.out.print("Enter roll: ");
            roll[count] = sc.nextInt();
            System.out.print("Enter marks: ");
            marks[count] = sc.nextInt();
            sc.nextLine();
            count++;
            System.out.println("Student added");
        } else {
            System.out.println("Record full");
        }
    }

    static void viewStudent() {
        if (count == 0) {
            System.out.println("No records");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Name: " + name[i] + " Roll: " + roll[i] + " Marks: " + marks[i]);
            }
        }
    }

    static void searchStudent() {
        System.out.print("Enter roll to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == search) {
                System.out.println("Name: " + name[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }
        System.out.println("Student not found");
    }

    static void updateMarks() {
        System.out.print("Enter roll to update: ");
        int update = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == update) {
                System.out.print("Enter new marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks updated");
                return;
            }
        }
        System.out.println("Student not found");
    }

    static void deleteStudent() {
        System.out.print("Enter roll to delete: ");
        int del = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == del) {
                for (int j = i; j < count - 1; j++) {
                    name[j] = name[j + 1];
                    roll[j] = roll[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Record deleted");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Update Marks");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}