package nicebank;

import io.cucumber.java.sl.In;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public boolean withdrawFrom(Account account, int dollars) {
        boolean successfulWithdrawal = false;

        if (account.getBalance().dollars() >= dollars) {
            account.withdraw(dollars);
            cashSlot.dispense(dollars);
            successfulWithdrawal = true;
        }
        else
            successfulWithdrawal = false;
        return successfulWithdrawal;
    }
}
