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

    public void accountInterest() {
        double accountInterest = (this.getBalance() * this.rateOfInterest) * this.savingYears;
        System.out.println("Du hast in den letzten " + this.savingYears + " Jahren " + accountInterest + "€ Zinsen erhalten.");
        setBalance(getBalance() + accountInterest);
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
