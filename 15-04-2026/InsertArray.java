import java.lang.*;
import java.util.*;

class InsertArray{
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Insert a new element at a specific position
        int newElement = 10;
        int position = 2; // Position to insert (0-based index)

        // Create a new array with one extra space
        int[] newArray = new int[numbers.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
        }

        // Insert the new element
        newArray[position] = newElement;

        // Copy elements after the position
        for (int i = position; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        // Print the new array
        System.out.println("Array after insertion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}