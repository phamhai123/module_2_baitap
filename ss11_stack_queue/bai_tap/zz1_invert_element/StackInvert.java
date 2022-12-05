package ss11_stack_queue.bai_tap.zz1_invert_element;

import java.util.Scanner;
import java.util.Stack;

public class StackInvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mWork;
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        stack = stackInvert(stack);
        for (Integer stack1: stack
             ) {
            System.out.println(stack1);
        }
        Stack wStack = new Stack();

        do {
            System.out.println("Enter a size: ");
            mWork = scanner.nextInt();
            if (mWork>20){
                System.out.println("Size does not exceed 20");
            }
        } while (mWork>20);
        int i = 0;
        while (i < mWork) {
            System.out.print("Enter element " + (i + 1) + ": ");
            wStack.push(scanner.nextInt());
            i++;
        }
        wStack = stackInvert(wStack);
        for (Object stack1: wStack
        ) {
            System.out.println(stack1);
        }
    }
    public static Stack<Integer> stackInvert(Stack<Integer> stack) {
        Stack<Integer> stackChange = new Stack<>();
        while (!stack.isEmpty()){
            stackChange.push(stack.pop());
        }
        return  stackChange;
    }
}
