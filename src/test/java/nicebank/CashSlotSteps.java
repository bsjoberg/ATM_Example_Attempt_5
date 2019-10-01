package nicebank;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;

public class CashSlotSteps {
    private KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer dollars) throws Throwable {
        Assert.assertEquals("Incorrect dispensed amount -", dollars, helper.getCashSlot().getContents());
    }
}