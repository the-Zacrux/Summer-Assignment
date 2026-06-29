import java.util.Scanner;
public class program119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int id[] = new int[5];
        String dept[] = new String[5];
        int salary[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nMini Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.print("Enter employee name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter employee ID: ");
                        id[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter department: ");
                        dept[count] = sc.nextLine();
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
                        System.out.println("No employee records found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + name[i] +
                                    " ID: " + id[i] +
                                    " Department: " + dept[i] +
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
                            System.out.println("Department: " + dept[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Employee not found");
                    break;

                case 4:
                    System.out.print("Enter employee ID to update salary: ");
                    int update = sc.nextInt();
                    boolean updated = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == update) {
                            System.out.print("Enter new salary: ");
                            salary[i] = sc.nextInt();
                            System.out.println("Salary updated successfully");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated)
                        System.out.println("Employee not found");
                    break;

                case 5:
                    System.out.print("Enter employee ID to delete: ");
                    int del = sc.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == del) {
                            for (int j = i; j < count - 1; j++) {
                                name[j] = name[j + 1];
                                id[j] = id[j + 1];
                                dept[j] = dept[j + 1];
                                salary[j] = salary[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Employee deleted successfully");
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Employee not found");
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