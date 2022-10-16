public class Main {
    public static void main(String[] args) {
        //sap xep tu nho den lon;
        int[] a = {1,9,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }

        for (int x :
             a ) {
            System.out.print(" " + x);
        }
    }
}