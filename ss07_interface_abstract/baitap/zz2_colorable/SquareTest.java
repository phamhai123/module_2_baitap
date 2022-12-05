package ss07_interface_abstract.baitap.zz2_colorable;

import ss07_interface_abstract.baitap.zz2_colorable.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(3);
        System.out.println(square);
        square = new Square(4, "blue", true);
        System.out.println(square);
    }
}
