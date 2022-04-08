package at.satir.Accounts;

public class LittleCountryAccount extends BaseAccount {

    private double membershipYears;
    private double accountManagement;

    public LittleCountryAccount(double balance, double membershipYears, double accountManagement) {
        super(balance);
        this.membershipYears = membershipYears;
        this.accountManagement = accountManagement;
    }


}
