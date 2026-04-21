import java.lang.*;
import java.util.*;

class Cylinder{
    double radius;
    double height;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        return;
    }

    static double volume(double radius, double height){
        return Math.PI * radius * radius * height;
    }

    static double surfaceArea(double radius, double height){
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class CylinderCal {
    public static void main(String[] args){
        Cylinder c = new Cylinder(3.0, 5.0);

        System.out.println("Volume of cylinder with radius " + c.radius + " and height " + c.height + " is: " + Cylinder.volume(c.radius, c.height));
        System.out.println("Surface area of cylinder with radius " + c.radius + " and height " + c.height + " is: " + Cylinder.surfaceArea(c.radius, c.height));
    }   
}