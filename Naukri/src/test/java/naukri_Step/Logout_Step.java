package naukri_Step;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Login_page;

import Utility.Browser;
import Utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout_Step extends Browser {
	Logger logger = LogManager.getLogger(Logout_Step.class);
	Login_page loginpage;

    @Given("^Open chrome and naukri application$")
    public void open_chrome_and_naukri_application() throws Throwable {
		driver = Browsersetup("Chrome");
		logger.info("Chrome Browser launches");
	}

    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
		
		loginpage = new Login_page(driver);
		logger.info("website launched");

		loginpage.signin();
		loginpage.enteruid("chaithu9169@gmail.com");

	}


    @Then("^user  will be able to login$")
    public void user_will_be_able_to_login() throws Throwable {
		loginpage.enterpwd("12345@ch67#");
	}

    @Then("^select logout option$")
    public void select_logout_option() throws Throwable  {
		loginpage.loginbutton();
		logger.info("login successfully");
		logger.info("Screenshot is taken successfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage.closed();

	}
}
