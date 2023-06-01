package ro.ase.cts.unittestslab;

public class BankAccount {
    private String ibanCode;
    private double amount;
    private String currency;
    private boolean blocked;

    public BankAccount() {
    }

    public boolean isBlocked() {
        return this.blocked;
    }

    public void block() {
        this.blocked = true;
    }

    public void unblock() {
        this.blocked = false;
    }

    public String getIbanCode() {
        return this.ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
