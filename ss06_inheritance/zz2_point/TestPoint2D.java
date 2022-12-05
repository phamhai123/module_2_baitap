package ss06_inheritance.zz2_point;

import java.util.Arrays;
public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(2,3);
        System.out.println(point2D);
        point2D.setXY(3,4);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);

    }
}
