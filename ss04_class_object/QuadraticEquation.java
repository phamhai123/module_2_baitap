package ss04_class_object;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        double a = sc.nextDouble();
        System.out.println("Enter B:");
        double b = sc.nextDouble();
        System.out.println("Enter C:");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has ones root " + equation.getRoot1());
        } else {
            System.out.println("The equation has not roots ");
        }

    }
}
