package day40_exception.bank;

public class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException(String str) {
        super(str);
    }
}