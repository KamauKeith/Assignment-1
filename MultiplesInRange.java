public class MultiplesInRange {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 within the range 71 to 150:");

        for (int number = 71; number <= 150; number++) {
            if (number % 2 == 0 || number % 3 == 0 || number % 7 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
