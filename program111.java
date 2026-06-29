import java.util.Scanner;
public class program111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seats[] = {"A1", "A2", "A3", "A4", "A5"};
        boolean booked[] = new boolean[5];
        int choice;

        while (true) {
            System.out.println("\nTicket Booking System");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seat Status:");
                    for (int i = 0; i < seats.length; i++) {
                        System.out.println(seats[i] + " - " + (booked[i] ? "Booked" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number (1-5): ");
                    int book = sc.nextInt();

                    if (book > 0 && book <= 5) {
                        if (!booked[book - 1]) {
                            booked[book - 1] = true;
                            System.out.println("Seat booked successfully");
                        } else {
                            System.out.println("Seat already booked");
                        }
                    } else {
                        System.out.println("Invalid seat number");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number (1-5) to cancel: ");
                    int cancel = sc.nextInt();

                    if (cancel > 0 && cancel <= 5) {
                        if (booked[cancel - 1]) {
                            booked[cancel - 1] = false;
                            System.out.println("Seat cancelled successfully");
                        } else {
                            System.out.println("Seat is not booked");
                        }
                    } else {
                        System.out.println("Invalid seat number");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}