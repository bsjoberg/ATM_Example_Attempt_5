package nicebank;

public class AutomatedTeller implements Teller {
    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    @Override
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
