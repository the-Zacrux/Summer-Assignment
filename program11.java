import java.util.Scanner;
public class program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n2 >=n1){
            n2=n2+n1-(n1=n2);
        }
        for (int i = n2; i >= 1; i--) {
            if(n2%i==0 && n1%i==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
