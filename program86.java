import java.util.Scanner;
public class program86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        int count = 0;

        if (str.length() > 0) {
            count = 1;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    count++;
                }
            }
        }

        System.out.println("Number of words = " + count);
        sc.close();
    }
}