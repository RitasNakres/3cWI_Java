package at.satir.Accounts;

public class LittleCountryAccount extends BaseAccount {

    private double membershipYears;
    private double accountManagement;

    public LittleCountryAccount(double balance, double membershipYears) {
        super(balance);
        this.membershipYears = membershipYears;
    }

    public void accountKeepingCosts() {
        double accountKeepingCosts = 0;
        for (int i = 0; i < getMembershipYears(); i++) {
            accountKeepingCosts = accountKeepingCosts + this.accountManagement;
        }
        System.out.println("Dein Ländlegirokonto kostete dich seit deiner Kontoeröffnung " + accountKeepingCosts + "€");
        setBalance(getBalance() - accountKeepingCosts);
    }

    public double getMembershipYears() {
        return membershipYears;
    }

    public void setMembershipYears(double membershipYears) {
        this.membershipYears = membershipYears;
    }

    public double getAccountManagement() {
        return accountManagement;
    }

    public void setAccountManagement(double accountManagement) {
        this.accountManagement = accountManagement;
    }
}
