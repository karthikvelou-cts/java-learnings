import java.lang.*;


class DataTypeDetails
{
    public static void main(String[] args)
    {
        System.out.println("Data Type Details in Java:");
        System.out.println();

        int a = -5;
        int b = 10;
        int c = a + b;

        System.out.println("Integer value in binary: " + Integer.toBinaryString(a));
        System.out.println("Integer value: " + a);
        System.out.println("Integer sum in binary: " + Integer.toBinaryString(c));
        System.out.println("Integer sum: " + c);

        // byte
        System.out.println("byte:");
        System.out.println("Size: 8 bits");
        System.out.println("Range: -128 to 127");
        System.out.println();

        // short
        System.out.println("short:");
        System.out.println("Size: 16 bits");
        System.out.println("Range: -32,768 to 32,767");
        System.out.println();

        // int
        System.out.println("int:");
        System.out.println("Size: 32 bits");
        System.out.println("Range: -2,147,483,648 to 2,147,483,647");
        System.out.println();

        // long
        System.out.println("long:");
        System.out.println("Size: 64 bits");
        System.out.println("Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println();

        // float
        System.out.println("float:");
        System.out.println("Size: 32 bits");
        System.out.println("Range: Approximately ±3.40282347E+38F (6-7 significant decimal digits)");
        System.out.println();

        // double
        System.out.println("double:");
        System.out.println("Size: 64 bits");
        System.out.println("Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)");
    }
}

