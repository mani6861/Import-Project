package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.awt.geom.AreaOp;

public class TestStepDef {
    @Given("^I am in test given$")
    public void i_am_in_test_given() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("Give0n Printed\n");

    }

    @When("^I do test when$")
    public void i_do_test_when() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("\nWhen Printed\n");
    }

    @Then("^I get test then$")
    public void i_get_test_then() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("\nThen Printed\n");
    }

}
