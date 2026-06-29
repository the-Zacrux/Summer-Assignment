import java.util.Scanner;

public class program110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        int accNo[] = new int[5];
        int balance[] = new int[5];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\nBank Account System");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < 5) {
                        sc.nextLine();
                        System.out.print("Enter account holder name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter account number: ");
                        accNo[count] = sc.nextInt();
                        System.out.print("Enter initial balance: ");
                        balance[count] = sc.nextInt();
                        count++;
                        System.out.println("Account created successfully");
                    } else {
                        System.out.println("Bank record full");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No accounts found");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + name[i] +
                                    " Account No: " + accNo[i] +
                                    " Balance: " + balance[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Enter deposit amount: ");
                    int depAmt = sc.nextInt();

                    boolean depFound = false;
                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == depAcc) {
                            balance[i] += depAmt;
                            System.out.println("Deposit successful");
                            depFound = true;
                            break;
                        }
                    }
                    if (!depFound)
                        System.out.println("Account not found");
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int wdAcc = sc.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    int wdAmt = sc.nextInt();

                    boolean wdFound = false;
                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == wdAcc) {
                            if (balance[i] >= wdAmt) {
                                balance[i] -= wdAmt;
                                System.out.println("Withdrawal successful");
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            wdFound = true;
                            break;
                        }
                    }
                    if (!wdFound)
                        System.out.println("Account not found");
                    break;

                case 5:
                    System.out.print("Enter account number to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == search) {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Account No: " + accNo[i]);
                            System.out.println("Balance: " + balance[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found");
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