import java.lang.*;
import java.util.*;

public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int calculation = (a + b + c) / 2;
        System.out.println("Area of triangle: " + calculation);

        // Rectangle area
        int area = a * b;
        System.out.println("Area of rectangle: " + area);

        // area of square
        int areaOfSquare = a * a;
        System.out.println("Area of square: " + areaOfSquare);
        sc.close();
    }
}
