/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/
package support;

import hooks.ServerHooks;
import nicebank.Account;
import nicebank.Teller;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;


class AtmUserInterface implements Teller {
    private RemoteWebDriver webDriver;
    private KnowsTheDomain helper;

    public AtmUserInterface() throws MalformedURLException {
        this.webDriver = new FirefoxDriver(new FirefoxOptions());
        //this.webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), new FirefoxOptions());
    }

    @Override
    public boolean debitFrom(Account account, int dollars) {
        try {
            webDriver.get("http://localhost:" + ServerHooks.PORT);
            webDriver.findElement(By.id("amount"))
                    .sendKeys(String.valueOf(dollars));
            webDriver.findElement(By.id("withdraw")).click();
        }
        finally {
            webDriver.close();
        }
        return false;
    }
}