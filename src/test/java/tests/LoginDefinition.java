package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import utils.ClassNameUtil;

public class LoginDefinition extends Fixture {

    private static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());

    @Given("^I navigate to ellos website$")
    public void i_navigate_to_ellos_website() {

    }

    @Given("^I click Login link$")
    public void i_click_Login_link() {

    }

    @When("^I write email address \"([^\"]*)\"$")
    public void i_write_email_address(String arg1) {

    }

    @When("^I write password \"([^\"]*)\"$")
    public void i_write_password(String arg1) {

    }

    @When("^I click on button login$")
    public void i_click_on_button_login() {

    }

    @Then("^I see that I am logged in$")
    public void i_see_that_I_am_logged_in() {

    }

    @Then("^I logged out$")
    public void i_logged_out() {

    }

}
