package at.satir.Accounts;

public class SavingAccount extends BaseAccount {

    private double savingYears;
    private double rateOfInterest;

    public SavingAccount(double balance, double savingYears, double rateOfInterest) {
        super(balance);
        this.savingYears = savingYears;
        this.rateOfInterest = rateOfInterest;
    }

    public double getSavingYears() {
        return savingYears;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0) {
            return super.withdraw(amount);
        } else {
            System.out.println("This action is not possible");
            return 0;
        }
    }
}
