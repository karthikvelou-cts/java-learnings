import java.lang.*;
import java.util.*;

class StaticPractice{
    static int count = 0;

    static int a = 10; // Static variable

    StaticPractice(){
        count++;
    }

    static void displayCount(){
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticPractice sp1 = new StaticPractice();
        StaticPractice sp2 = new StaticPractice();
        StaticPractice sp3 = new StaticPractice();

        System.out.println("Value of a: " + StaticPractice.a);
        StaticPractice.a = 20;
        System.out.println("Updated value of a: " + StaticPractice.a);

        StaticPractice.displayCount(); // Output: Count: 3
    }
}