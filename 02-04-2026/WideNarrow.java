import java.lang.*;

class WideNarrow{
    public static void main(String[] args) {
        // Widening conversion (automatic)
        byte b = 10;
        short s= 200;
        long l = 10;
        int a = 1000;
        l = a;
        b = (byte) s;
        b = (byte) l;
        b = (byte) a;
        System.out.println("Widening Conversion: int a = " + a + ", long b = " + b);

        // Narrowing conversion (manual)
        double c = 3.14;
        int d = (int) c; // double must be manually cast to int
        System.out.println("Narrowing Conversion: double c = " + c + ", int d = " + d);
    }
}