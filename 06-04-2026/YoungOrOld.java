import java.lang.*;
import java.util.*;

class YoungOrOld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age < 12)
        {
            System.out.println("You are a child.");
        }
        else if(age >= 12 && age < 18)
        {
            System.out.println("You are a teenager.");
        }
        else if(age >= 18 && age < 30)
        {
            System.out.println("You are young.");
        }
        else
        {
            System.out.println("You are old.");
        }
    }
}