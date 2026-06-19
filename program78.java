import java.util.Scanner;

public class program78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        boolean symmetric = true;
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric");
        sc.close();
    }
}