import java.lang.*;

// Swapping two numbers without using a temporary variable
class SwappingNumbers{

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
        
    }
}
