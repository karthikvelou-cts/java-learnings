import java.lang.*;
import java.util.*;

class CopyArrayElement{
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Position to copy (0-based index)
        int position = 2;

        // Create a new array with the same size
        int[] newArray = new int[numbers.length];

        // Copy elements from the original array to the new array
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }

        // Print the new array
        System.out.println("New array after copying:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        // Alternatively, you can also use the Arrays.copyOf() method to copy the array
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);

        // Print the new array 
        System.out.println("New array after copying:" + Arrays.toString(numbers2));
    }
}