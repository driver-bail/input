import java.util.Scanner;

public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false; // Found a factor, not a prime number
            }
        }

        return true; // No factors found, it's a prime number
    }

    public static void main(String[] args) {
        // Input: a number to check for primality
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime and display the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
