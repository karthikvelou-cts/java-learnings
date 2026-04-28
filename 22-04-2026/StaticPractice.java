import java.lang.*;
import java.util.*;

class StaticParent
{
    static void show()
    {
        System.out.println("Parent class show method");
    }
}

class StaticChild extends StaticParent
{
    static void show()
    {
        System.out.println("Child class show method");
    }
}   

public class StaticPractice
{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.show(); // Output: Parent class show method

        Child c = new Child();
        c.show(); // Output: Child class show method

        Parent pc = new Child();
        pc.show(); // Output: Parent class show method (static methods are not polymorphic)
    }
}
