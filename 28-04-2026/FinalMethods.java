import java.lang.*;
import java.util.*;


class TestFinalMethods{
    final static int MIN = 0; // Static final variable initialized at declaration 
    final int MAX;
    final int CALC;

    {
        CALC = 100; // Final variable can be initialized in instance initializer block
    }

    TestFinalMethods() {
        MAX = 10; // Final variable can be initialized in constructor 
    }

    final void display() {
        System.out.println("Value of MIN: " + MIN);
        System.out.println("Value of CALC: " + CALC);
        System.out.println("Value of MAX: " + MAX);
    }
}

class FinalMethods{
    public static void main(String[] args) {
        TestFinalMethods tfm = new TestFinalMethods();
        // tfm.MIN = 5; // This will cause a compile-time error because 'MIN' is final
        // tfm.display = 5; // This will cause a compile-time error because 'display' is final  
        // tfm.MAX = 20; // This will cause a compile-time error because 'MAX' is final
        tfm.display();

        // @Override 
        // void display() {
        //     System.out.println("This will cause a compile-time error because 'display' is final and cannot be overridden.");
        // }
    }
    
}
