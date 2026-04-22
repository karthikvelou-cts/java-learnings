import java.lang.*;
import java.util.*;

abstract class Super{
    public Super(){
        System.out.println("Super class constructor");  
    }

    public void meth1(){
        System.out.println("Super class method");
    }

    public abstract void meth2();
}

public class AbstractExample extends Super{
    public AbstractExample(){
        System.out.println("AbstractExample class constructor");
    }
    @Override
    public void meth2(){
        System.out.println("AbstractExample class method");
    }
    public static void main(String[] args) {
        AbstractExample obj = new AbstractExample();
        obj.meth1(); // Output: Super class method
        obj.meth2(); // Output: AbstractExample class method
    }   
}