package Method;

public class SumTwo {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,1,2,3},{3,5,4,6}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo là: "+sum);
    }
}