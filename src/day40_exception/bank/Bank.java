package day40_exception.bank;

public class Bank {
    double balance;
    public void login (String username, String password) throws InvalidCredentialsException {
        if (!username.equals("loopcamp")) {
            throw new InvalidCredentialsException("Invalid username!");
        }
        if (!password.equals(("lpcamp2023"))) {
            throw new InvalidCredentialsException("Invalid password!");
        }
    }
    public void withdraw (double amount) throws NotEnoughBalanceException {
        if (amount > balance) {
            throw new NotEnoughBalanceException("Not enough funds!");
        }
    }
}