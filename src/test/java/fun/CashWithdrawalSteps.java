package fun;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CashWithdrawalSteps {
    class Account {
        private int balance = 0;

        public void deposit(int amount) {
            balance += amount;
        }

        public int getBalance() {
            return balance;
        }
    }

    @Given("I have deposited ${int} in my account")
    public void i_have_deposited_$_in_my_account(Integer amount) {
        Account myAccount = new Account();
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance - ", amount.longValue(), myAccount.getBalance());
    }

    @When("I request ${int}")
    public void i_request_$(Integer int1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer int1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
