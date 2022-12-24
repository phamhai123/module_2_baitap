package ss18_string_regex.zz2_valiate_phone_number;

public class ValidateTest {
    private static ValidatePhoneNumber validatePhoneNumber;

    public static final String[] validPhoneNumber = new String[]{"84-01443456789", "84-0239123921", "09-09347345678", "76-0956654561"};
    public static final String[] invalidPhoneNumber = new String[]{"ii-0987654345", "0-0987654321", "99-9876543212", "90-098765432"};

    public static void main(String args[]) {
        validatePhoneNumber = new ValidatePhoneNumber();
        for (String phone : validPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phone);
            System.out.println("Account is " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidPhoneNumber) {
            boolean isValid = validatePhoneNumber.validate(phone);
            System.out.println("Account is " + phone + " is valid: " + isValid);
        }
    }
}
