import java.lang.*;
import java.util.*;

class Car{
    void start(){
        System.out.println("Car is starting");
    }
    void gearChanged(){
        System.out.println("Car gear changed");
    }
    void stop(){
        System.out.println("Car is stopping");
    }   
}

class LuxuryCar extends Car{
    @Override
    void start(){
        System.out.println("Luxury Car is starting with a push button");
    }
    @Override
    void gearChanged(){
        System.out.println("Luxury Car gear changed smoothly");
    }
}

public class MethodOverride2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car is starting
        myCar.gearChanged(); // Output: Car gear changed

        LuxuryCar myLuxuryCar = new LuxuryCar();
        myLuxuryCar.start(); // Output: Luxury Car is starting with a push button
        myLuxuryCar.gearChanged(); // Output: Luxury Car gear changed smoothly
        myLuxuryCar.stop(); // Output: Car is stopping

        Car carRef = new LuxuryCar();
        carRef.start(); // Output: Luxury Car is starting with a push button (runtime polymorphism)
        carRef.gearChanged(); // Output: Luxury Car gear changed smoothly (runtime polymorphism)
        carRef.stop(); // Output: Car is stopping (runtime polymorphism)
    }
}   