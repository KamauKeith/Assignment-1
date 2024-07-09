import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMarks = 0.0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter the marks for Unit " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double average = totalMarks / 5;

        System.out.println("The average marks for the five units is: " + String.format("%.2f", average));

        scanner.close();
    }
}
