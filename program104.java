import java.util.Scanner;
public class program104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("Quiz Application");

        System.out.println("1. What is the capital of India?");
        System.out.println("1. Delhi  2. Mumbai  3. Kolkata  4. Chennai");
        ans = sc.nextInt();
        if (ans == 1) {
            score++;
        }

        System.out.println("2. Which language is used for Java programming?");
        System.out.println("1. Python  2. Java  3. C  4. HTML");
        ans = sc.nextInt();
        if (ans == 2) {
            score++;
        }

        System.out.println("3. How many days are there in a week?");
        System.out.println("1. 5  2. 6  3. 7  4. 8");
        ans = sc.nextInt();
        if (ans == 3) {
            score++;
        }

        System.out.println("Your score = " + score + "/3");

        sc.close();
    }
}