import java.lang.*;
import java.util.*;

class Recursion{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void sequence(int n){
        if(n > 0){
            
            sequence(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args){
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        sequence(number);
    }
}