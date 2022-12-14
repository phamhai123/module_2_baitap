package ss07_interface_abstract.baitap.zz1_resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }

    @Override
    public double resize(double percent) {
        return percent;
    }
}
