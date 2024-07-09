import java.util.Scanner;

public class NameAndAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        System.out.println("The number of characters in your surname is: " + surname.length());
        System.out.println("Your current age is an " + (age % 2 == 0 ? "even" : "odd") + " number");

        scanner.close();
    }
}