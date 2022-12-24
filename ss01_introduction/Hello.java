package ss01_introduction;

import utils.InputUtil;
import utils.RegexLibrary;

import java.util.Scanner;

public class Hello implements RegexLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = InputUtil.inputString("Enter your name :", scanner, NAME_VN_REGEX);
        System.out.println("Hello:" + name);
    }
}
