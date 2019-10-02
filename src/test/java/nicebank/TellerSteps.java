package nicebank;

import io.cucumber.java.en.When;
import support.KnowsTheDomain;

public class TellerSteps {
    private KnowsTheDomain helper;

    public TellerSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @When("I request ${int}")
    public void i_request_$(Integer dollars) {
        Teller teller = new Teller(helper.getCashSlot());

        teller.debitFrom(helper.getMyAccount(), dollars);
    }
}
