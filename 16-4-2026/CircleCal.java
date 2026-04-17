import java.lang.*;
import java.util.*;

class Circle {
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class CircleCal {

    public static void main(String[] args) {
        double radius = 5.0;
        System.out.println("Area of circle with radius " + radius + " is: " + Circle.area(radius));
        System.out.println("Circumference of circle with radius " + radius + " is: " + Circle.circumference(radius));
    }
}