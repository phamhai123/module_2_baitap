package ss03_method;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,1,2,5}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột cần tín: ");
        int id = sc.nextInt();
        System.out.println("Tổng cột " + id + " là: " + isSum(array, id));
    }
    public static int isSum (int array[][], int id) {

        int sum = 0;
        for (int i = 0; i < array[id].length; i++) {
            sum += array[id][i];
        }
        return sum;
    }
}
