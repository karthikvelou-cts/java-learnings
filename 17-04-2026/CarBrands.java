import java.lang.*;
import java.util.*;

class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}

public class CarBrands extends Car {
    CarBrands(String brand, String model, int year) {
        super(brand, model, year); // call parent constructor
    }

    public static void main(String[] args) {
        CarBrands car1 = new CarBrands("Toyota", "Camry", 2020);
        CarBrands car2 = new CarBrands("Honda", "Civic", 2019);
        CarBrands car3 = new CarBrands("Ford", "Mustang", 2021);

        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println("\nCar 2:");
        car2.displayInfo();
        System.out.println("\nCar 3:");
        car3.displayInfo();
    }
}
