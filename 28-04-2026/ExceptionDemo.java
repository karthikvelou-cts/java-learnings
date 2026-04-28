import java.lang.*;
import java.util.*;

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 2; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}