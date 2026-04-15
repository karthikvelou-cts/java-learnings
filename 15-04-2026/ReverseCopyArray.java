import java.lang.*;
import java.util.*;

class ReverseCopyArray {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Create a new array to hold the reversed elements
        int[] reversedArray = new int[numbers.length];

        // Copy elements from the original array to the new array in reverse order
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();
    }
}   