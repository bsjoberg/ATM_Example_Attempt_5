package fun;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CheckoutSteps {

    private int bananaPrice;
    private Checkout checkout;

    @Given("the price of a {string} is {int}c")
    public void the_price_of_a_is_c(String itemName, Integer priceOfItem) {
        bananaPrice = priceOfItem;
    }

    @When("I checkout {int} {string}")
    public void i_checkout(Integer numberOfItems, String itemName) {
        checkout = new Checkout();
        checkout.add(itemName, numberOfItems);
    }

    @Then("the total price is {int}c")
    public void the_total_price_is_c(Integer expectedTotalPrice) {
        assertEquals(expectedTotalPrice, checkout.total());
    }
}
