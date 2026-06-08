import java.util.Scanner;
public class program34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            int n=1;
            for(int j=5;j>=i;j--){
                System.out.print(n++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}