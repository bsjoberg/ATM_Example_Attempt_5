package nicebank;

import io.cucumber.java.sl.In;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public boolean debitFrom(Account account, int dollars) {
        boolean successfulDebit = false;

        if (account.getBalance().dollars() >= dollars) {
            account.debit(dollars);
            cashSlot.dispense(dollars);
            successfulDebit = true;
        }
        else
            successfulDebit = false;
        return successfulDebit;
    }
}
