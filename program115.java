import java.util.Scanner;
public class program115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        while (true) {
            System.out.println("\nString Operation System");
            System.out.println("1. Length");
            System.out.println("2. Reverse");
            System.out.println("3. Palindrome Check");
            System.out.println("4. Count Vowels");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reverse = " + rev);
                    break;

                case 3:
                    String temp = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        temp += str.charAt(i);
                    }
                    if (str.equals(temp))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 4:
                    int count = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            count++;
                        }
                    }
                    System.out.println("Vowels = " + count);
                    break;

                case 5:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}