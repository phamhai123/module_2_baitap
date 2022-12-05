package ss06_inheritance.zz1_circle_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", Volume=" + getVolume() +
                ", is a=" + super.toString() +
                '}';
    }

}
