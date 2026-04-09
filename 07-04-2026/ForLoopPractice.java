import java.lang.*;
import java.util.*;

class ForLoopPractice {
    public static void main(String[] args) {
        // Print numbers from 1 to 100
        System.out.println("Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // for a new line

        // Print even numbers from 1 to 200
        System.out.println("Even numbers from 1 to 200:");
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line

        // Print prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line
        System.out.println(); // for a new line
        // factorial of a number
        System.out.println("Factorial of a number:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        System.out.println(); // for a new line

        //fibonacci series
        System.out.println("Fibonacci series up to n terms:");
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // for a new line
        scanner.close();
    }
}