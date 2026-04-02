import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime number checking");
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter a positive integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int a = scanner.nextInt();
        scanner.close();

        // Handle numbers <= 1
        if (a <= 1) {
            System.out.println(a + " is NOT a prime number.");
            return;
        }

        boolean isPrime = true;

        // Check divisibility
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is NOT a prime number.");
        }
    }
}
