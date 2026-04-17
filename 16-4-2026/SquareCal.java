import java.lang.*;
import java.util.*;

class Square {

    private int side;

    void setSide(int side) {
        this.side = side;
    }

    int getSide() {
        return this.side;
    }
    
    static int area(int side) {
        return side * side;
    }

    static int perimeter(int side) {
        return 4 * side;
    }
}

class SquareCal {
    public static void main(String[] args) {
        Square Square = new Square();
        int side = 4;
        Square.setSide(side);
        System.out.println("Area of square with side " + side + " is: " + Square.area(Square.getSide()));
        System.out.println("Perimeter of square with side " + side + " is: " + Square.perimeter(Square.getSide()));
    }
}