package Introduction;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền usd :");
        usd = sc.nextDouble();
        double  quydoi = usd * vnd;
        System.out.println("Giá trị VNĐ: " + quydoi);
    }
}
