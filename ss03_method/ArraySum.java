package ss03_method;

import utils.InputUtil;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 1, 2, 5}};
        Scanner sc = new Scanner(System.in);
        int id = InputUtil.inputInteger("Nhập số cột cần tín: ",sc);
        System.out.println("Tổng cột " + id + " là: " + isSum(array, id));
    }
    public static int isSum(int array[][], int id) {

        int sum = 0;
        for (int i = 0; i < array[id].length; i++) {
            sum += array[id][i];
        }
        return sum;
    }
}
