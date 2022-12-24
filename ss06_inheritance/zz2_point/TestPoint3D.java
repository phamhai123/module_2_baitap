package ss06_inheritance.zz2_point;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1, 3, 4);
        System.out.println(point3D);
        point3D = new Point3D(4, 5, 6);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
