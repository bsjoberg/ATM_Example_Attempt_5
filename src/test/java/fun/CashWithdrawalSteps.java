package fun;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CashWithdrawalSteps {

    private Account myAccount;

    @Given("I have deposited {money} in my account")
    public void i_have_deposited_$_in_my_account(Money amount) {
        myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance - ", amount, myAccount.getBalance());
    }

    @When("I request ${int}")
    public void i_request_$(Integer dollars) {
        Teller teller = new Teller();
        teller.withdrawFrom(myAccount, dollars);
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer int1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
