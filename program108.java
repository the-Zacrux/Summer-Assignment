import java.util.Scanner;
public class program108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int roll;
        int m1, m2, m3, m4, m5;
        int total;
        double percentage;
        String grade;

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();

        System.out.print("Enter marks of 5 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n----- Marksheet -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}