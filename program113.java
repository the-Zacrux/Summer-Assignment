import java.util.Scanner;
public class program113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b, result;

        while (true) {
            System.out.println("\nMenu Driven Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a + b;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a - b;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a * b;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0) {
                        result = a / b;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero");
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