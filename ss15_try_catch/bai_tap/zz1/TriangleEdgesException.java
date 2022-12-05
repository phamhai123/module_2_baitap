package ss15_try_catch.bai_tap.zz1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleEdgesException extends Exception {
    public TriangleEdgesException(String str) {
        super(str);
    }

    public static void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = sc.nextInt();

            try {
                checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (InputMismatchException e) {
            System.out.println("Sai: khong dung dinh dang!");
        }
        sc.close();
    }
}



