import java.lang.*;
import java.util.*;


class MethodPractice{

    static int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int result = max(num1, num2);
        System.out.println("The maximum number is: " + result);

        //without staic keyword call the methods
        MethodPractice mp = new MethodPractice();
        int sum = mp.add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}