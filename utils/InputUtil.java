package utils;

import java.util.Scanner;

public class InputUtil{
    private static String MESSAGE = "Input invalid!";
    public static String inputString(String message,Scanner sc){
        System.out.println(message);
        return sc.nextLine();
    }
    public static int inputInteger(String message,Scanner sc){
        int result =0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        try {
            result = Integer.getInteger(inputValue);
        }catch (Exception e){
            System.out.println(MESSAGE);
            return inputInteger(message,sc);
        }
        return result;
    }
    public static double inputDouble(String message,Scanner sc){
        double result = 0;
        System.out.println(message);
        String inputValue = sc.nextLine();
        try {
            result = Double.parseDouble(inputValue);
        }catch (Exception e){
            System.out.println(MESSAGE);
            return inputDouble(message,sc);
        }
        return result;
    }
    public static String inputString(String message,Scanner sc,String regex){
        System.out.println(message);
        String value = sc.nextLine();
        if(value.matches(regex)){
            return value;
        }else {
            System.out.println(MESSAGE);
        }
        return  inputString(message,sc,regex);
    }
}