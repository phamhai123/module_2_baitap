package Loop;

public class primeSmall {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(printPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    private static boolean printPrime(int i) {
        boolean num = true;
        if (i<2||i==99){
            num = false;
        }
        for (int j = 2; j <= i; j++) {
            if (i%2==0){
                num = false;
            }
        }
        return num;
    }
}
