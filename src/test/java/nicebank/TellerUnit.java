package nicebank;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TellerUnit {
    @Test
    public void test_withdraw_money_from_account() {
        Account account = new Account();
        account.deposit(new Money("$100.00"));
        CashSlot cashSlotMock = mock(CashSlot.class);
        Teller teller = new Teller(cashSlotMock);
        try {
            teller.withdrawFrom(account, 20);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(new Money("$80.00"), account.getBalance());
    }

    @Test
    public void test_attempt_withdraw_from_account_with_insufficient_funds() {
        Account account = new Account();
        account.deposit(new Money("$50.00"));
        CashSlot cashSlotMock = mock(CashSlot.class);
        Teller teller = new Teller(cashSlotMock);
        try {
            teller.withdrawFrom(account, 100);
        } catch (InsufficientFundsException ise) {
            Assert.assertEquals("Insufficient Funds for this Withdrawal Attempt", ise.getMessage());
        }
        Assert.assertEquals(new Money("$50.00"), account.getBalance());
    }
}
