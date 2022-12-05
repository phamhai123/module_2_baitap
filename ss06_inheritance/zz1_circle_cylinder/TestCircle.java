package ss06_inheritance.zz1_circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());

        circle = new Circle(2, "yellow");
        System.out.println(circle);
        System.out.println(circle.getArea());


    }
}
