import java.util.Scanner;

public class DivisibilityTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("divisibility checks:");

        // This If statement checks divisibility by 2 for even numbers
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2 because it's an even number.");
        }

        // This If statement checks divisibility by 5 (ends in 0 or 5)
        if (number % 10 == 0 || number % 10 == 5) {
            System.out.println(number + " is divisible by 5 because it ends with a " + number % 10 + ".");
        }

        // This If statement checks divisibility by 3 (sum of digits divisible by 3)
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        if (sumOfDigits % 3 == 0) {
            System.out.println(number + " is divisible by 3 because the sum of its digits (" + sumOfDigits + ") is divisible by 3.");
        }

        // This If statement checks divisibility by 4 (last two digits divisible by 4) - can be explained for older kids
        if (number % 100 == 0 || number % 100 == 4 || number % 100 == 16 || number % 100 == 64) {
            System.out.println(number + " is divisible by 4 (applicable for larger numbers).");
        }
        scanner.close();
    }
}
