import java.lang.*;
import java.util.*;

class Parent
{
    void show()
    {
        System.out.println("Parent class show method");
    }
}

class Child extends Parent
{
    @Override
    void show()
    {
        System.out.println("Child class show method");
    }
}

public class MethodOverride
{
    public static void main(String[] args)
    {
        Parent p = new Parent();
        p.show(); // Output: Parent class show method

        Child c = new Child();
        c.show(); // Output: Child class show method

        Parent pc = new Child();
        pc.show(); // Output: Child class show method (runtime polymorphism)
    }
}