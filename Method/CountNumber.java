package Method;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        String a = "Hai pham 112002D đi đâu thế";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char comment = sc.next().charAt(0);
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==comment){
                count++;
            }
        }
        System.out.println("count char is: "+count);
    }
}
