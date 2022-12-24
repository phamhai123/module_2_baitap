package ss02_loop_array.zz1_loop;

public class PrimeSmall {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (printPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean printPrime(int n) {
        boolean num = true;
        if (n < 2) {
            num = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    num = false;
                }
            }
        }
        return num;
    }
}
