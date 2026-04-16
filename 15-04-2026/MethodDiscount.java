import java.lang.*;
import java.util.*;

public class MethodDiscount {
    
    static void calculateDiscount(double price, double discountPercentage){
        double discountAmount = (price * discountPercentage) / 100;
        double finalPrice = price - discountAmount;
        System.out.println("Original Price: $" + price);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }

    public static void main(String[] args){
        double price = 100.0;
        double discountPercentage = 15.0;
        calculateDiscount(price, discountPercentage);
        calculateDiscount(200.0, 25.0);
        calculateDiscount(50.0, 10.0);
        calculateDiscount(150.0, 20.0);
        calculateDiscount(300.0, 30.0);
    }
}
