package stepDefinations;

import org.junit.runner.RunWith;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepD {

	 @Given("^User at NetBanking landing page \"([^\"]*)\"$")
	    public void user_at_netbanking_landing_page_something(String strArg1) throws Throwable {
	        
	    }

	    @When("^User login with username (.+) and password (.+)$")
	    public void user_login_with_username_and_password(String username, String password) throws Throwable {
	        
	    }

	    @Then("^Home page dashboard is populated$")
	    public void home_page_dashboard_is_populated() throws Throwable {
	       
	    }

	    @And("^Other options are displayed \"([^\"]*)\"$")
	    public void other_options_are_displayed_something(String strArg1) throws Throwable {
	        
	    }

}