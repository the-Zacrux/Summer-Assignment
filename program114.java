import java.util.Scanner;
public class program114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int choice;

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.println("\nMatrix Operation System");
            System.out.println("1. Display Matrix");
            System.out.println("2. Row-wise Sum");
            System.out.println("3. Column-wise Sum");
            System.out.println("4. Diagonal Sum");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        int sum = 0;
                        for (int j = 0; j < 3; j++) {
                            sum += arr[i][j];
                        }
                        System.out.println("Row " + (i + 1) + " Sum = " + sum);
                    }
                    break;

                case 3:
                    for (int j = 0; j < 3; j++) {
                        int sum = 0;
                        for (int i = 0; i < 3; i++) {
                            sum += arr[i][j];
                        }
                        System.out.println("Column " + (j + 1) + " Sum = " + sum);
                    }
                    break;

                case 4:
                    int dsum = 0;
                    for (int i = 0; i < 3; i++) {
                        dsum += arr[i][i];
                    }
                    System.out.println("Diagonal Sum = " + dsum);
                    break;

                case 5:
                    System.out.println("Transpose:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[j][i] + " ");
                        }
                        System.out.println();
                    }
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