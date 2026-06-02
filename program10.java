import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2) {
            System.out.println("Invalid input. n1 should be less than or equal to n2.");
            sc.close();
            return;
        }
        if(n1 < 0 || n2 < 0) {
            System.out.println("Invalid input. Both numbers should be non-negative.");
            sc.close();
            return;
        }
        for (int i = n1; i <= n2; i++) {

            if (i < 2)
                continue;
            int j;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                }
            }

            if (j > Math.sqrt(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}