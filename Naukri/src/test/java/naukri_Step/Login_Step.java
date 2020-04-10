package naukri_Step;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Login_page;

import Utility.Browser;
import Utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_Step extends Browser {
	Logger logger = LogManager.getLogger(Login_page.class);
	Login_page loginpage;
	
	
    @Given("^user launch the naukri application$")
    public void user_launch_the_naukri_application() throws Throwable {
		driver = Browsersetup("Chrome");
		logger.info("Chrome Browser launches");
	}



    @Then("^user enters the valid username$")
    public void user_enters_the_valid_username() throws Throwable  {
		
		loginpage = new Login_page(driver);
		logger.info("website launched");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./src/test/resources/Screenshots/sceenshot2.png");
		loginpage.signin();
		loginpage.enteruid("chaithu9169@gmail.com");

	}
    @Then("^user will enter password$")
    public void user_will_enter_password() throws Throwable{
		loginpage.enterpwd("12345@ch67#");
	}


    @Then("^click on the login button user nagivate to the next page$")
    public void click_on_the_login_button_user_nagivate_to_the_next_page() throws Throwable  {
		loginpage.loginbutton();
		logger.info("login successfully");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshots/naukri.png");
		logger.info("Screenshot is taken successfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage.closed();

	}

}


