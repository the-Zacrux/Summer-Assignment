import java.util.Scanner;
public class program101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 to 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high");
            } else if (guess < number) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        sc.close();
    }
}