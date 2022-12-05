package ss04_class_object;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is on" +
                    '}';
        } else {
            return "Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    ", fan is off" +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fanA = new Fan();
        fanA.setSpeed(fanA.FAST);
        fanA.setRadius(10);
        fanA.setColor("yellow");
        fanA.setOn(true);

        Fan fanB = new Fan();
        fanB.setSpeed(fanB.MEDIUM);
        fanB.setRadius(5);
        fanB.setColor("blue");
        fanB.setOn(false);

        System.out.println(fanA.toString());
        System.out.println(fanB.toString());
    }
}
