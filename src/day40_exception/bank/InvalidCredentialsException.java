package day40_exception.bank;

public class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String str) {
        super(str);
    }
}