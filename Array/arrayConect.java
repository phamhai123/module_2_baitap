package Array;

public class arrayConect {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5};
        int[] arrB = {6,7,8,9,12};
        int[] arrC = new int[arrA.length + arrB.length];
        int num = 0;
        for (int i = 0; i < arrC.length; i++) {
            if(i<arrA.length){
                arrC[i] = arrA[i];
            }else {
                arrC[i] = arrB[num++];
            }
        }
        for (int i = 0; i < arrC.length; i++) {
            System.out.print(" " + arrC[i]);
        }
    }
}
