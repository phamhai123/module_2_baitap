package Method;

public class Min {
    public static void main(String[] args) {
        int arr[] = {3,2,5,4,7,1,6,8,10};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là: "+ min);
    }
}
