import java.util.Scanner;
public class program103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int pin = 1234;
        int enteredPin;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter ATM PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                int choice, amount;

                while (true) {
                    System.out.println("\n1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Change PIN");
                    System.out.println("5. Exit");
                    System.out.print("Enter choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Balance = " + balance);
                            break;

                        case 2:
                            System.out.print("Enter deposit amount: ");
                            amount = sc.nextInt();
                            balance += amount;
                            System.out.println("Deposit successful");
                            break;

                        case 3:
                            System.out.print("Enter withdraw amount: ");
                            amount = sc.nextInt();
                            if (amount <= balance) {
                                balance -= amount;
                                System.out.println("Withdrawal successful");
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;

                        case 4:
                            System.out.print("Enter new PIN: ");
                            pin = sc.nextInt();
                            System.out.println("PIN changed successfully");
                            break;

                        case 5:
                            System.out.println("Thank you");
                            sc.close();
                            return;

                        default:
                            System.out.println("Invalid choice");
                    }
                }
            } else {
                attempts--;
                System.out.println("Wrong PIN. Attempts left: " + attempts);
            }
        }

        System.out.println("ATM blocked");
        sc.close();
    }
}