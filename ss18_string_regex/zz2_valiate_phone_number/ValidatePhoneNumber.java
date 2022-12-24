package ss18_string_regex.zz2_valiate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX = "^(\\d{2})+[-]+(0)+(\\d{9})$";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
