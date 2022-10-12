package Array;

import java.util.Scanner;

public class moreElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = new int[array.length+1];
        System.out.println("Enter index: ");
        int id = sc.nextInt();
        System.out.println("Enter a element number: ");
        int number = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if(i >= id && i< array.length){
                newArr[i+1]=array[i];
            }else {
                newArr[i] = array[i];
            }
        }
        newArr[id] = number;
        for (int i = 0; i < newArr.length ; i++) {
            System.out.print(" " + newArr[i]);
        }
    }
}
