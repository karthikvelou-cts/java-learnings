import java.lang.*;
import java.util.*;

class RectangleCalc{

    double length;
    double breadth;

    static double area(double length, double breadth){
        return length * breadth;
    }

    static double perimeter(double length, double breadth){
        return 2 * (length + breadth);
    }

    static void isSquare(double length, double breadth){
        if(length == breadth){
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }
    }
}

class Rectangle{
    public static void main(String[] args){

        RectangleCalc r = new RectangleCalc();

        r.length = 5.0;
        r.breadth = 3.0;

        System.out.println("Area of rectangle with length " + r.length + " and breadth " + r.breadth + " is: " + RectangleCalc.area(r.length, r.breadth));
        System.out.println("Perimeter of rectangle with length " + r.length + " and breadth " + r.breadth + " is: " + RectangleCalc.perimeter(r.length, r.breadth));
        RectangleCalc.isSquare(r.length, r.breadth);
    }   
}