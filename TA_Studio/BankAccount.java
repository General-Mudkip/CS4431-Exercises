package TA_Studio;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) throws IllegalArgumentException {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        } else {
            this.balance = balance;
        }
    }

}
