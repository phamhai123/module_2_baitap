package Loop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element: ");
        int numbers = sc.nextInt();
        int count = 0;
        int i = 0;
        while (count < numbers){
            if(printPrime(i)==true){
                System.out.println(i);
                count++;
            }
            i++;

        }
    }

    private static boolean printPrime(int i) {
        boolean num = true;
        if (i<2){
            num = false;
        }
        for (int j = 2; j < i; j++) {
            if (i%2==0){
                num = false;
            }
        }
        return num;
    }
}
