import java.lang.*;
import java.util.*;

abstract class Hospital{
    abstract void doctor();
    abstract void nurse();
    void staff(){
        System.out.println("Hospital has staff");
    }
    abstract void appointment();
}

public class AbstractExample2 extends Hospital{
    @Override
    void doctor(){
        System.out.println("Hospital has doctors");
    }
    @Override
    void nurse(){
        System.out.println("Hospital has nurses");
    }
    public static void main(String[] args) {
        AbstractExample2 hospital = new AbstractExample2();
        hospital.doctor(); // Output: Hospital has doctors
        hospital.nurse(); // Output: Hospital has nurses
        hospital.staff(); // Output: Hospital has staff
    }
    @Override
    void staff(){
        System.out.println("Hospital has staff and support personnel");
    }
    @Override
    void appointment(){
        System.out.println("Hospital has appointments");
    }
}