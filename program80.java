import java.util.Scanner;

public class program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) {
                sum = sum + a[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
        sc.close();
    }
}