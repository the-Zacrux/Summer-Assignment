import java.util.Scanner;
public class program90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    ch = str.charAt(i);
                    break;
                }
            }
            if (ch != ' ')
                break;
        }

        if (ch != ' ')
            System.out.println("First repeating character = " + ch);
        else
            System.out.println("No repeating character found");

        sc.close();
    }
}