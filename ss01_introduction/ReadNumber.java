package ss01_introduction;

import utils.InputUtil;

import java.util.Scanner;

public class ReadNumber {
    static String[] donvi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] chuc = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = InputUtil.inputInteger("Nhap vao so n: ", scanner);
        if (n < 20) {
            System.out.println(docSoNhoHon20(n));
        } else if (n < 100) {
            System.out.println(docHaiChuSo(n));
        } else {
            System.out.println(docBaChuSo(n));
        }
    }

    public static String docBaChuSo(int n) {
        if (n % 100 == 0) {
            return donvi[n / 100] + " hundred";
        } else if (n % 100 < 20) {
            return donvi[n / 100] + " hundred and " + docSoNhoHon20(n % 100);
        } else {
            return donvi[n / 100] + " hundred and " + docHaiChuSo(n % 100);
        }
    }

    public static String docHaiChuSo(int n) {
        if (n % 10 == 0) {
            return chuc[n / 10 - 2];
        } else {
            return chuc[n / 10 - 2] + " " + donvi[n % 10];
        }
    }

    public static String docSoNhoHon20(int n) {
        return donvi[n];
    }
}
