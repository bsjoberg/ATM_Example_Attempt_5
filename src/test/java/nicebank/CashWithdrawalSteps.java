package nicebank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CashWithdrawalSteps {

    private Account myAccount;
    private KnowsTheDomain helper;

    public CashWithdrawalSteps() {
        helper = new KnowsTheDomain();
    }

    @Given("I have deposited {money} in my account")
    public void i_have_deposited_$_in_my_account(Money amount) {
        helper.getMyAccount().deposit(amount);

        Assert.assertEquals("Incorrect account balance - ", amount, helper.getMyAccount().getBalance());
    }

    @When("I request ${int}")
    public void i_request_$(Integer dollars) {
        Teller teller = new Teller(helper.getCashSlot());
        teller.withdrawFrom(helper.getMyAccount(), dollars);
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer dollars) throws Throwable {
        Assert.assertEquals("Incorrect dispensed amount -", dollars, helper.getCashSlot().getContents());
    }
}
