import java.lang.*;
import java.util.*;

class PracticeClass{

    static void circle(double radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    static void rectangle(double length, double width){
        double area = length * width;
        System.out.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);
    }

    static void triangle(double base, double height){
        double area = 0.5 * base * height;
        System.out.println("Area of triangle with base " + base + " and height " + height + " is: " + area);
    }

    static void square(double side){
        double area = side * side;
        System.out.println("Area of square with side " + side + " is: " + area);
    }

    public static void main(String[] args){
        circle(5);
        rectangle(4, 6);
        triangle(3, 4);
        square(4);
    }   
}