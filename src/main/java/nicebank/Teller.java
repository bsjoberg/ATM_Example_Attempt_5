package nicebank;

import io.cucumber.java.sl.In;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) throws InsufficientFundsException {
        if (account.getBalance().dollars() >= dollars) {
            account.withdraw(dollars);
            cashSlot.dispense(dollars);
        }
        else
            throw new InsufficientFundsException();
    }
}
