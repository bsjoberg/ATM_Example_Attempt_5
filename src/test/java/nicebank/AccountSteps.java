package nicebank;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import support.KnowsTheDomain;

public class AccountSteps {
    private final KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("my account has been credited {money}")
    public void my_account_has_been_credited(Money amount) {
        helper.getMyAccount().credit(amount);
    }

    @And("the balance of my account should be {money}")
    public void the_balance_of_my_account_should_be(Money expectedAmount) {
        Assert.assertEquals("Incorrect account balance - ", expectedAmount, helper.getMyAccount().getBalance());
    }
}
