package ss06_inheritance.zz1_circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

        cylinder = new Cylinder(3, 5, "red");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
