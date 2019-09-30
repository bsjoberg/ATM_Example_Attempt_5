package nicebank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import support.KnowsTheDomain;

public class AccountSteps {
    private KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("I have deposited {money} in my account")
    public void i_have_deposited_$_in_my_account(Money amount) {
        helper.getMyAccount().deposit(amount);

        Assert.assertEquals("Incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }
}
