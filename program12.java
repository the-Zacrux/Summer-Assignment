import java.util.Scanner;
public class program12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n2 >=n1){
            n2=n2+n1-(n1=n2);
        }
        for (int i =n1 ; i <= n1*n2; i++) {
            if(i%n2==0 && i%n1==0){
                System.out.println("LCM is: " + i);
                break;
            }
        }
        sc.close();
    }
}