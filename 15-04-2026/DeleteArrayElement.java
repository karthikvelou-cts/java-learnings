import java.lang.*;
import java.util.*;     

public class DeleteArrayElement {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {91, 92, 93, 94, 95};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Position to delete (0-based index)
        int position = 1;

        // Create a new array with one less space
        int[] newArray = new int[numbers.length - 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
        }

        System.out.println("New Array changed as per the position: " + Arrays.toString(newArray));

        // Copy elements after the position
        for (int i = position + 1; i < numbers.length; i++) {
            newArray[i - 1] = numbers[i];
        }
        System.out.println("Copy elements after the position: " + Arrays.toString(newArray));

        // Print the new array
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }
}
