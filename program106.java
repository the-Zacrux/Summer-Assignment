import java.util.Scanner;
public class program106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int id[] = new int[5];
        int salary[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        sc.nextLine();
                        System.out.print("Enter employee name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter employee ID: ");
                        id[count] = sc.nextInt();
                        System.out.print("Enter salary: ");
                        salary[count] = sc.nextInt();
                        count++;
                        System.out.println("Employee added successfully");
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
                                    " ID: " + id[i] +
                                    " Salary: " + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == search) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("ID: " + id[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found");
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