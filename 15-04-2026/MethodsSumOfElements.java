import java.lang.*;
import java.util.*;

class MethodSumOfElements{

    static int sumOfElements(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        int sum = sumOfElements(arr);
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}