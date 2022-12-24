package utils;

public interface RegexLibrary {
    String NAME_VN_REGEX = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]+$";
    String STRING_REGEX ="[A-Z][a-z]";
    String PHONE_REGEX = "^(\\d{2})+[-]+(0)+(\\d{9})$";
    String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)$";
}
