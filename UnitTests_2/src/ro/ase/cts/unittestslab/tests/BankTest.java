package ro.ase.cts.unittestslab.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.unittestslab.Bank;

import java.util.Locale;

import static org.junit.Assert.*;

public class BankTest {

    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank();
    }

    @After
    public void tearDown() throws Exception {
        bank = null;
    }

    @Test
    public void setName() {
        String testStr = "german bank inc";
        bank.setName(testStr);
        Assert.assertEquals("Set nu este implementat corect", testStr, bank.getName());
        Assert.assertTrue("Minim 5 caractere", bank.getName().length() >= 5);
        Assert.assertTrue("Trebuie să conțină cuvântul bank", bank.getName().toLowerCase(Locale.ROOT).contains("bank"));
    }

    @Test
    public void setAddress() {
        String testAddress = "17 sud street";
        bank.setAddress(testAddress);
        Assert.assertEquals("Adresa nu este setată corect", testAddress, bank.getAddress());
    }

    @Test
    public void setSwiftCode() {
        String testSwiftCode = "ADDDEF333";
        bank.setSwiftCode(testSwiftCode);
        Assert.assertEquals("Codul SWIFT nu este setat corect", testSwiftCode, bank.getSwiftCode());
    }
}