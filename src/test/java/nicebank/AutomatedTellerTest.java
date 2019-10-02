package nicebank;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class AutomatedTellerTest {
    @Test
    public void test_debit_money_from_account() {
        Account account = new Account();
        account.credit(new Money("$100.00"));
        CashSlot cashSlotMock = mock(CashSlot.class);
        AutomatedTeller teller = new AutomatedTeller(cashSlotMock);

        Assert.assertTrue(teller.debitFrom(account, 20));
        Assert.assertEquals(new Money("$80.00"), account.getBalance());
    }

    @Test
    public void test_attempt_debit_from_account_with_insufficient_funds() {
        Account account = new Account();
        account.credit(new Money("$50.00"));
        CashSlot cashSlotMock = mock(CashSlot.class);
        AutomatedTeller teller = new AutomatedTeller(cashSlotMock);

        Assert.assertFalse(teller.debitFrom(account, 100));
        Assert.assertEquals(new Money("$50.00"), account.getBalance());
    }
}
