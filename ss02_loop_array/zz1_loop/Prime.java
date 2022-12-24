package ss02_loop_array.zz1_loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int numbers = sc.nextInt();
        int count = 0;
        int i = 0;
        while (count < numbers) {
            if (printPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;

        }
    }

    private static boolean printPrime(int n) {
        boolean num = true;
        if (n < 2) {
            num = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                num = false;
            }
        }
        return num;
    }
}
