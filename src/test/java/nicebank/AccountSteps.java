package nicebank;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @And("​the balance of my account should be {money}")
    public void the_balance_of_my_account_should_be(Money expectedAmount) {
        Assert.assertEquals("Incorrect account balance - ", expectedAmount, helper.getMyAccount().getBalance());
    }
}
