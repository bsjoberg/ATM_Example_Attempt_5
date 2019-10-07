package support;

import nicebank.Account;
import nicebank.AutomatedTeller;
import nicebank.CashSlot;
import nicebank.Teller;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;

public class KnowsTheDomain {
    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;
    private RemoteWebDriver webDriver;

    public Account getMyAccount() {
        if (myAccount == null) {
            myAccount = new Account();
        }

        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }

        return cashSlot;
    }

    public Teller getTeller() throws MalformedURLException {
        if (teller == null) {
            teller = new AtmUserInterface();
        }

        return teller;
    }

    public RemoteWebDriver getWebDriver() {
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        if (webDriver == null){
            webDriver = new FirefoxDriver(new FirefoxOptions());
        }

        return webDriver;
    }
}
