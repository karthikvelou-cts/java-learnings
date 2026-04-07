import java.lang.*;


class RelationalOperators{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if(a>b && a>c)
        {
            System.out.println("a is greater than b and c");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater than a and c");
        }
        else
        {
            System.out.println("c is greater than a and b");        
        }
    }
}