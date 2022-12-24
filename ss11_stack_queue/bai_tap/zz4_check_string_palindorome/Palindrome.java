package ss11_stack_queue.bai_tap.zz4_check_string_palindorome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Queue check = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string :");
        String strings = scanner.nextLine();
        strings = strings.toLowerCase();
        for (int i = strings.length() - 1; i >= 0; i--) {
            check.add(strings.charAt(i));
        }
        String text = "";
        while (!check.isEmpty()) {
            text = text + check.remove();
        }
        if (text.equals(strings)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}


