package ss11_stack_queue.bai_tap.zz3_optional_convert_decimal_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stacks;
        System.out.println("Enter a decimal number :");
        int number = scanner.nextInt();
        stacks = convertToBinary(number);
        System.out.println("The result is :");
        for (Integer stack : stacks
        ) {
            System.out.print(stack);
        }
    }

    public static Stack<Integer> convertToBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        stack = stackInvert(stack);
        return stack;
    }

    public static Stack<Integer> stackInvert(Stack<Integer> stack) {
        Stack<Integer> stackChange = new Stack<>();
        while (!stack.isEmpty()) {
            stackChange.push(stack.pop());
        }
        return stackChange;
    }
}
