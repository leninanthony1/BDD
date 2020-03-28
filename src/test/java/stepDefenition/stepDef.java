package stepDefenition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class stepDef {

    @Given("^User is on Landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("landing page");
    }

    @When("^User logging in with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logging_in_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("logging in with "+strArg1+" and" +strArg2);
    }
    @When("^User logging in with (.+) and password (.+)$")
    public void user_logging_in_with_and_password(String username, String password) throws Throwable {
    	System.out.println("logging in with "+username+" and" +password);
    }

    @Then("^User logged in$")
    public void user_logged_in() throws Throwable {
    	System.out.println("logged in");
    }
    @And("^Cards displayed (.+)$")
    public void cards_displayed(String dispalyed) throws Throwable {
    	System.out.println("displayed" +dispalyed);
    }

}