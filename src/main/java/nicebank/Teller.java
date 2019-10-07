package nicebank;

import java.net.MalformedURLException;

public interface Teller {
    boolean debitFrom(Account account, int dollars) throws MalformedURLException;
}
