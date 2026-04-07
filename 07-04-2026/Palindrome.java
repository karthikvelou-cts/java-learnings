import java.lang.*;
import java.util.*;

class Palindrome{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = scanner.nextInt();
        int originalNumber = number; // Store the original number for comparison
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        scanner.close();
    }
}