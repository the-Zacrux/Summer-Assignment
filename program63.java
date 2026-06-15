import java.util.Scanner;
public class program63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(sum==arr[i]+arr[j]){
                    System.out.println(arr[i] +"    "+arr[j]);
                    return;
                }
            }
        }
        System.out.println("Not Found");
        sc.close();
    }
}