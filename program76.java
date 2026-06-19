import java.util.Scanner;

public class program76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int sum = 0;
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum = sum + a[i][i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
        sc.close();
    }
}