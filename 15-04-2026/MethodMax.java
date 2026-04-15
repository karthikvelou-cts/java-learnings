import java.lang.*;
import java.util.*;

class MethodMax{
    
    static int max(int ...num)
    {
        if(num.length == 0){ return Integer.MIN_VALUE; }
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(max(1, 2, 3, 4, 5));
        System.out.println(max());
        System.out.println(max(100,20,30,50));
    }   

}