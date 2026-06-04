import java.util.Scanner;
public class program20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n = sc.nextInt();
        int x=0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if(x<=i){
                    x=i;
                }
                n = n / i;
            }
        }
        System.out.println("Largest prime factor is: " + x);
        sc.close();
    }
}