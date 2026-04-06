import java.lang.*;

class Increment{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Increment: a = " + a + ", b = " + b);

        System.out.println("checking the increment in print statement: " + a++); // This will print 10, then increment a to 11
        System.out.println("checking the increment in print statement: " + ++b); // This will increment b to 21, then print it

        // Using pre-increment
        int preIncrementA = ++a; // a is incremented before assignment
        int preIncrementB = ++b; // b is incremented before assignment

        System.out.println("After Pre-Increment: a = " + preIncrementA + ", b = " + preIncrementB);

        // Using post-increment
        int postIncrementA = a++; // a is assigned before incrementing
        int postIncrementB = b++; // b is assigned before incrementing

        System.out.println("After Post-Increment: a = " + postIncrementA + ", b = " + postIncrementB);
        System.out.println("Final values: a = " + a + ", b = " + b);

         //character increment possible
        char x = 'A';

        System.out.println("Before Increment: x = " + x);
        x++;
        System.out.println("After Increment: x = " + x);

        //byte increment possible, but it will not allow the assign value to be greater than 127
        byte y = 10;
        byte z = (byte)(y + 1); // This will cause a compile-time error because the result of y + 1 is an int, which cannot be directly assigned to a byte without casting.
        System.out.println("Before Increment: y = " + y);
        y++;
        System.out.println("After Increment: y = " + y);
    }
}