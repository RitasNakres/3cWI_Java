package at.satir.Accounts;

public class Main {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(3000);
        ca.deposit(5000);
        ca.withdraw(5000);
        System.out.println(ca.getBalance());

    }
}
