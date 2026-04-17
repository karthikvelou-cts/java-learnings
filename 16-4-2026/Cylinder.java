import java.lang.*;
import java.util.*;

class CylinderCalc{

    double radius;
    double height;

    static double volume(double radius, double height){
        return Math.PI * radius * radius * height;
    }
    
    static double surfaceArea(double radius, double height){
        return 2 * Math.PI * radius * (radius + height);
    }

    static double lidArea(double radius){
        return Math.PI * radius * radius;
    }

    static double lateralSurfaceArea(double radius, double height){
        return 2 * Math.PI * radius * height;
    }   
}

class Cylinder{
    public static void main(String[] args){

        CylinderCalc c = new CylinderCalc();

        c.radius = 3.0;
        c.height = 5.0;

        System.out.println("Volume of cylinder with radius " + c.radius + " and height " + c.height + " is: " + CylinderCalc.volume(c.radius, c.height));
        System.out.println("Surface area of cylinder with radius " + c.radius + " and height " + c.height + " is: " + CylinderCalc.surfaceArea(c.radius, c.height));
        System.out.println("Lid area of cylinder with radius " + c.radius + " is: " + CylinderCalc.lidArea(c.radius));
        System.out.println("Lateral surface area of cylinder with radius " + c.radius + " and height " + c.height + " is: " + CylinderCalc.lateralSurfaceArea(c.radius, c.height));
    }   
}   