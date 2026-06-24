import java.util.Scanner;
public class program91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram");
            return;
        }

        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        boolean flag = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Strings are anagram");
        else
            System.out.println("Strings are not anagram");

        sc.close();
    }
}