/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package support;

import nicebank.Account;
import nicebank.Teller;

class AtmUserInterface implements Teller {

    @Override
    public boolean debitFrom(Account account, int dollars) {
        return false;
    }
}