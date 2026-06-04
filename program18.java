import java.util.Scanner;
public class program18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int n = sc.nextInt();
        int sum=0,x=n;
        while(x>0){
            int fac=1;
            for(int i=1; i<=x%10; i++){
                fac=fac*i;
            }
            sum=sum+fac;
            x=x/10;
        }
        System.out.println((sum==n)?"Strong Number":"Not a Strong Number");
        sc.close();
    }
}