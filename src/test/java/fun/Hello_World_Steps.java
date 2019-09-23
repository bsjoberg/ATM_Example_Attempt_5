package fun;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Hello_World_Steps {
    private Hello_World hello_world;
    private String message;

    @Given("I have a hello world app")
    public void i_have_a_hello_world_app() {
        // Write code here that turns the phrase above into concrete actions
        hello_world = new Hello_World();
    }

    @When("I say hi")
    public void i_say_hi() {
        // Write code here that turns the phrase above into concrete actions
        message = hello_world.sayHi();
    }

    @Then("I hear {string}")
    public void i_hear(String expectedMessage) {
        assertEquals(expectedMessage, message);
    }
}
