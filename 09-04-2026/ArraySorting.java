import java.lang.*;
import java.util.*;

class ArraySorting {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sort the array using Arrays.sort()
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}