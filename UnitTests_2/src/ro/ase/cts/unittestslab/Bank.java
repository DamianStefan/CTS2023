package ro.ase.cts.unittestslab;

import java.util.HashMap;
import java.util.List;

public class Bank {
    private String name;
    private String address;
    private String swiftCode;
    private HashMap<String, Client> clientsList;

    public Bank() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        if (name.length() >= 5 && name.toLowerCase().contains("bank")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid bank name");
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public void setSwiftCode(String swiftCode) {

        this.swiftCode = swiftCode;
    }

    public Client getClientByCNP(String cnp) {
        return null;
    }
}
