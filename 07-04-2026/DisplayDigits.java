import java.lang.*;
import java.util.*;


class DisplayDigits{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Digits in the number:");
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            System.out.print(digit);
            number /= 10; // Remove the last digit
        }

        System.out.println(); // Move to the next line after displaying digits
        //count the number of digits
        int count = 0;
        System.out.print("Enter a number to count its digits: ");
        int temp = scanner.nextInt();
        while(temp > 0){
            temp /= 10;
            count++;
        }
        System.out.println("\nNumber of digits: " + count);
        scanner.close();
    }
}