package at.satir.Accounts;

public class Main {
     public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(1500, 2, 4);
        ca.deposit(5000);
        ca.withdraw(5000);
        System.out.println(ca.getBalance());

        SavingAccount sa1 = new SavingAccount(3000, 5, 0.04);
        sa1.accountInterest();

        LittleCountryAccount lca1 = new LittleCountryAccount(3000, 2);
        lca1.accountKeepingCosts(83.04);

        CreditAccount ca1 = new CreditAccount(2000, 5);
        ca1.creditCosts(-500, 0.023);
    }
}
