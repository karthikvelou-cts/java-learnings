import java.lang.*;
import java.util.*;


class Variables {
    public static void main(String[] args) {
        int num1 = 300000; // range of int is -2,147,483,648 to 2,147,483,647
        double num2 = 20.5; // range of double is approximately ±1.7E-308 to ±1.7E+308
        String name = "Karthik"; // range of String is only limited by memory
        boolean isJavaFun = true;
        byte byteVar = 127; // -127 to 127
        char charVar = 'A'; // range of char is 0 to 65535 (Unicode characters)

        System.out.println("Integer: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("String: " + name);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Byte: " + byteVar);
        System.out.println("Char: " + charVar);
    }
}