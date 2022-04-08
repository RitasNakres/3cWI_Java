package at.satir.Accounts;

public class CheckingAccount extends BaseAccount {

    private double membershipYears;
    private double rateOfInterest;
    private int limit;

    public CheckingAccount(double balance, double membershipYears, double rateOfInterest) {
        super(balance);
        this.membershipYears = membershipYears;
        this.rateOfInterest = rateOfInterest;
    }

    public void accountInterest(){
        double accountInterest = (this.getBalance() * this.rateOfInterest) * this.membershipYears;
        System.out.println("Du hast über die letzten " + this.membershipYears + " Jahre " + accountInterest + " Zinsen gezahlt.");
        setBalance(getBalance()-accountInterest);
    }

    @Override
    public double withdraw (double amount) {
        if ((getBalance() - amount) > (limit * -1)) {
            System.out.println("Withdrawn: " + amount + "€");
            return super.withdraw(amount);
        } else {
            System.out.println("This action is not possible");
            return 0;
        }
    }

}
