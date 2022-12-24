package ss01_introduction;

import utils.InputUtil;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double vnd = 22000;
        double usd;
        Scanner sc = new Scanner(System.in);
        usd = InputUtil.inputDouble("Mời bạn nhập số tiền usd :", sc);
        double quyDoi = usd * vnd;
        System.out.println("Giá trị VNĐ: " + quyDoi);
    }
}
