package ss05_access_modifier.zz1_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + "Area=" + getArea() + '}';
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
