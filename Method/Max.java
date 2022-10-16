package Method;

public class Max {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{11,10,9,12}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất: "+max);
    }
}
