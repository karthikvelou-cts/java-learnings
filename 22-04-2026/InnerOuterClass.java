import java.lang.*;
import java.util.*;


class OuterClass{
    int outerVar = 10;

    // Inner class defined within the OuterClass
    class InnerClass{
        void display(){
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

public class InnerOuterClass {
    public static void main(String[] args) {
        // Creating an instance of the OuterClass
        OuterClass outer = new OuterClass();
        // Creating an instance of the InnerClass using the OuterClass instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}