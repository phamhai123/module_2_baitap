package Method;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,1,2,5}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột cần tín: ");
        int id = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr[id].length; i++) {
            sum += arr[id][i];
        }
        System.out.println("Tổng cột "+id+" là: "+sum);
    }
}
