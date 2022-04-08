package at.satir.Accounts;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(1,1,1);
        ca.deposit(5000);
        ca.withdraw(5000);
        System.out.println(ca.getBalance());

        SavingAccount sa1 = new SavingAccount(3000,5,0.04);
        sa1.accountInterest();
    }
}
