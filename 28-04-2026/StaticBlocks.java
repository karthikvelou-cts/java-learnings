import java.lang.*;
import java.util.*;

class StaticBlocks{
    static int count;
    static{
        count = 100;
        System.out.println("Static block executed. Count initialized to: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed. Count: " + count);
    }

    static{
        System.out.println("Second static block executed.");
    }
}