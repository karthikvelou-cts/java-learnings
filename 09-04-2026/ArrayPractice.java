import java.lang.*;
import java.util.*;

class ArrayPractice {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the elements: " + sum);
    }
}