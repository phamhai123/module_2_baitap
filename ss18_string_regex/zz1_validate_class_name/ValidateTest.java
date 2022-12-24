package ss18_string_regex.zz1_validate_class_name;

public class ValidateTest {
    private static ValidateClassName classNameExample;

    public static final String[] validClassName = new String[]{"C0318G", "A0722I", "C0192H", "P1100K", "P1111G"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P032A", "AB123A", "C123A"};

    public static void main(String args[]) {
        classNameExample = new ValidateClassName();
        for (String account : validClassName) {
            boolean isValid = classNameExample.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isValid);
        }
        for (String account : invalidClassName) {
            boolean isValid = classNameExample.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isValid);
        }
    }
}
