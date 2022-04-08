package at.satir.Accounts;

public class LittleCountryAccount extends BaseAccount {

    private double membershipYears;

    public LittleCountryAccount(double balance, double membershipYears) {
        super(balance);
        this.membershipYears = membershipYears;
    }

    public void accountKeepingCosts(double accountManagement) {
        double accountKeepingCosts = 0;
        for (int i = 0; i < getMembershipYears(); i++) {
            accountKeepingCosts = accountKeepingCosts + accountManagement;
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
}
