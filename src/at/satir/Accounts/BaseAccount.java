package at.satir.Accounts;

public class BaseAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit (double amount) {
        System.out.println("Deposited: " + amount);
        this.balance += amount;
    }
}
