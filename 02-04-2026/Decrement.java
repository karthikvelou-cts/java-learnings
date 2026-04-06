import java.lang.*;

class Decrement{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Decrement: a = " + a + ", b = " + b);

        // Using pre-decrement
        int preDecrementA = --a; // a is decremented before assignment
        int preDecrementB = --b; // b is decremented before assignment

        System.out.println("After Pre-Decrement: a = " + preDecrementA + ", b = " + preDecrementB);

        // Using post-decrement
        int postDecrementA = a--; // a is assigned before decrementing
        int postDecrementB = b--; // b is assigned before decrementing

        System.out.println("After Post-Decrement: a = " + postDecrementA + ", b = " + postDecrementB);
        System.out.println("Final values: a = " + a + ", b = " + b);

    }
}