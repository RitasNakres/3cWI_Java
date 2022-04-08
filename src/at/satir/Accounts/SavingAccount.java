package at.satir.Accounts;

public class SavingAccount extends BaseAccount {

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
