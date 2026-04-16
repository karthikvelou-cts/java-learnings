import java.lang.*;
import java.util.*;

class PrimeNumbersArray {
    public static void main(String[] args) {
        int n = 2000; // Change this value to generate prime numbers up to n
        int[] primes = new int[n];
        int count = 0;

        for (int i = 2; count < n; i++) {
            if (isPrime(i)) {
                primes[count] = i;
                count++;
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}