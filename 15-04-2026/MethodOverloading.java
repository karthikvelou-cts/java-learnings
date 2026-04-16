import java.lang.*;
import java.util.*;

public class MethodOverloading {
    
    static int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    static float max(float a, float b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int result = max(num1, num2);
        System.out.println("The maximum number is: " + result);

        float num3 = 15.5f;
        float num4 = 10.3f;
        float result2 = max(num3, num4);
        System.out.println("The maximum float number is: " + result2);
    }
}
