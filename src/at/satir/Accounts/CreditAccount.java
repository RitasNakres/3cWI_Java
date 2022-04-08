package at.satir.Accounts;

public class CreditAccount extends BaseAccount {

    private double loanMonths;

    public CreditAccount(double balance, double loanMonths) {
        super(balance);
        this.loanMonths = loanMonths;
    }

    public void creditCosts(double creditLimit, double loanInterest) {
        double creditCosts = 0;
        if (this.getBalance() <= creditLimit) {
            System.out.println("Du hast das Kontolimit überschritten.");
        } else if (this.getBalance() >= 0) {
            System.out.println("Du musst keine Kreditkosten abzahlen.");
        } else {
            creditCosts = (-this.getBalance() * loanInterest) * this.loanMonths;
            System.out.println("Du musst " + creditCosts + "€ Kreditzinsen zahlen.");
            setBalance(getBalance() - creditCosts);
        }
    }

    public double getLoanMonths() {
        return loanMonths;
    }
}

