import java.lang.*;
import java.util.*;

class MaxElementArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int max = findMax(arr);
        System.out.println("The maximum element in the array is: " + max);
    }

    static int findMax(int[] array) {
        int max = array[0]; // Assume the first element is the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}       