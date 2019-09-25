package fun;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CashWithdrawalSteps {
    class Account {
        private Money balance = new Money();

        public void deposit(Money amount) {
            balance = balance.add(amount);
        }

        public Money getBalance() {
            return balance;
        }
    }

    @Given("I have deposited \\$(\\d+)\\.(\\d+) in my account")
    public void i_have_deposited_$_in_my_account(int dollars, int cents) {
        Account myAccount = new Account();
        Money amount = new Money(dollars, cents);
        myAccount.deposit(amount);

        Assert.assertEquals("Incorrect account balance - ", amount, myAccount.getBalance());
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
