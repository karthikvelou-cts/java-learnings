import java.lang.*;
import java.util.*;

class RotatingArray {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Rotate the array to the right by one position
        int lastElement = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastElement;

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}   