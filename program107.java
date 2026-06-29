import java.util.Scanner;
public class program107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int basic[] = new int[5];
        int hra[] = new int[5];
        int da[] = new int[5];
        int total[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nSalary Management System");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. View Salary Details");
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
                        System.out.print("Enter basic salary: ");
                        basic[count] = sc.nextInt();

                        hra[count] = basic[count] * 20 / 100;
                        da[count] = basic[count] * 10 / 100;
                        total[count] = basic[count] + hra[count] + da[count];

                        count++;
                        System.out.println("Salary record added");
                    } else {
                        System.out.println("Record full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Basic: " + basic[i]);
                            System.out.println("HRA: " + hra[i]);
                            System.out.println("DA: " + da[i]);
                            System.out.println("Total Salary: " + total[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter employee name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Total Salary: " + total[i]);
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