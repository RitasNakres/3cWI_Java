package at.satir.Accounts;

public class CreditAccount extends BaseAccount {

    private double loanInterest = 0.023;
    private double creditLimit = -200;
    private double loanMonths;

    public CreditAccount(double balance, double loanMonths) {
        super(balance);
        this.loanMonths = loanMonths;
    }
}
