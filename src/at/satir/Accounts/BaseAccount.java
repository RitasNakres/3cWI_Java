package at.satir.Accounts;

public class BaseAccount {

    protected double balance;

    public BaseAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amountOfDeposit) {
        this.balance += amountOfDeposit;
    }

    public double withdraw(double amountOfWithdraw) {
        this.balance -= amountOfWithdraw;
        return amountOfWithdraw;
    }
}

