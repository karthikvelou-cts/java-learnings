import java.lang.*;


class Literals
{
    public static void main(String[] args)
    {
        int a = 10; // Integer literal
        double b = 3.14; // Floating-point literal
        char c = 'A'; // Character literal
        String s = "Hello, World!"; // String literal
        boolean flag = true; // Boolean literal

        //short literal
        short sh = 100; // Short literal

        //long literal
        long l = 10000000000L; // Long literal need to end with 'L' or 'l'


        //float and double literals
        float f = 3.14f; // Float literal need to end with 'f' or 'F'
        double d = 3.14; // Double literal

        //for a big number we can use underscore to make it more readable
        long bigNumber = 1_000_000_000L; // Long literal with underscores for readability

        // Print the literals
        System.out.println("Literals in Java:");

        System.out.println("Integer literal: " + a);
        System.out.println("Floating-point literal: " + b);
        System.out.println("Character literal: " + c);
        System.out.println("String literal: " + s);
        System.out.println("Boolean literal: " + flag);
        System.out.println("Long literal: " + l);
        System.out.println("Float literal: " + f);
        System.out.println("Double literal: " + d);
        System.out.println("Short literal: " + sh);
        System.out.println("Big number literal: " + bigNumber);
    }
}