package nicebank;

public interface Teller {
    boolean debitFrom(Account account, int dollars);
}
