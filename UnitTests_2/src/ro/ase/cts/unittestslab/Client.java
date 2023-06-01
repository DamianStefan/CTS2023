package ro.ase.cts.unittestslab;

import java.util.List;

public class Client {
    private String name;
    private String id;
    private List<clase.BankAccount> accounts;

    public Client() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addAccount(clase.BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }
}
