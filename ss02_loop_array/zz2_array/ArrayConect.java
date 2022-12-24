package ss02_loop_array.zz2_array;

import java.util.Scanner;

public class ArrayConect {
    public static void main(String[] args) {
        int[] arrA;
        int[] arrB;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size array A: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
//      Gán giá trị cho arrA
        arrA = createArr(size);
        do {
            System.out.println("Enter a size array B: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arrB = createArr(size);
        int[] arrC = new int[arrA.length + arrB.length];
        int num = 0;
        for (int i = 0; i < arrC.length; i++) {
            if (i < arrA.length) {
                arrC[i] = arrA[i];
            } else {
                arrC[i] = arrB[num++];
            }
        }
        for (int i = 0; i < arrC.length; i++) {
            System.out.print(" " + arrC[i]);
        }
    }

    //    Phương thức tạo một mảng
    public static int[] createArr(int size) {

        int[] array;
        Scanner scanner = new Scanner(System.in);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
