package day40_exception.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.balance = 100_000;
        try {
            b1.login("loopcamp", "lpcamp2023");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
        try {
            b1.withdraw(50_000);
        } catch (NotEnoughBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}