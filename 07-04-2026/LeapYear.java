import java.lang.*;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        // 👇 Change this value to test different years
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println("Year: " + year);

        // Leap year logic
        if (year % 4 == 0) { // divisible by 4
            if (year % 100 == 0) { // divisible by 100
                if (year % 400 == 0) { // divisible by 400
                    System.out.println("Its a Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Its a Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
