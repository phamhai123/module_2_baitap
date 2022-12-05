package ss07_interface_abstract.baitap.zz2_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2,3);
        shapes[3] = new Square(4);
        for (Shape shape: shapes
             ) {
            System.out.println(shape.howToColor());
        }

    }
}
