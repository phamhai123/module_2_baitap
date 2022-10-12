package Loop;

import java.util.Scanner;

public class pictures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Print the rectangle1\n" +
                "2. Print the square triangle\n" +
                "3. Print isosceles triangle\n" +
                "4. Exit");
        int option;
        do {
            option = sc.nextInt();
            switch (option){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >=i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
            }
        }while (option!=4);
    }
}
