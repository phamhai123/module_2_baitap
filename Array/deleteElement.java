package Array;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {1,2,3,4,5,6,3,8,9};
        int[] remove;
        System.out.println("Enter a number need delete :");
        int x = sc.nextInt();
        int num = 0;

        for (int i = 0; i < n.length; i++) {
            if (x!=n[i]){
                num++;
            }
        }
        int count = 0;
        remove = new int[num];
        for (int i = 0; i < n.length; i++) {
                if (n[i]!=x){
                    remove[count++] = n[i];
                }
        }
        n = remove;
        for (int i = 0; i < n.length; i++) {
            System.out.print(" " +n[i]);
        }
    }
}
