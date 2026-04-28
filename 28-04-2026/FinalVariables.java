import java.lang.*;
import java.util.*;

class FinalVariables{
    final int MAX = 10; // Final variable
    static final int MIN; // Static final variable declared here, initialized in static block
    final int CALC; // Final variable declared here, initialized in constructor

    void display(){
        // MAX = 20; // This will cause a compile-time error because 'MAX' is final
        System.out.println("Value of MAX: " + MAX);
    }

    static{
        MIN = 0; // Static final variable can be initialized in static block
    }

    FinalVariables(){
        CALC = 100; // Static final variable can be initialized in constructor
    }

    public static void main(String[] args) {
        FinalVariables fv = new FinalVariables();
        System.out.println("Value of MIN: " + MIN);
        System.out.println("Value of CALC: " + fv.CALC);
        fv.display();
    }
}