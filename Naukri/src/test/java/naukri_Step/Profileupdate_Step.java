package naukri_Step;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Login_page;

import com.Profileupdate;

import Utility.Browser;
import Utility.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Profileupdate_Step extends Browser {
	
	Logger logger = LogManager.getLogger(Profileupdate .class);
	 Login_page loginpage;
	 Profileupdate  profileup;
	 @Given("^launch the chrome browser and the url$")
	    public void launch_the_chrome_browser_and_the_url() throws Throwable{
    	driver = Browsersetup("Chrome");
    	 loginpage = new  Login_page(driver);
    	
    	 Thread.sleep(2000);
    	 logger.info("Chrome Browser launches");
      
    }

@When("^enter valid details such as username and password$")
public void enter_valid_details_such_as_username_and_password() throws Throwable {
    	 
    	 loginpage.signin();
        loginpage.enteruid("jayanthimala.p27@gmail.com");
        loginpage.enterpwd("jaya@1234");
        loginpage.loginbutton();
        logger.info("login successfully");
    }

    @Then("^user selects the profile update option$")
    public void user_selects_the_profile_update_option() throws Throwable {
    	 profileup = new Profileupdate(driver);
    	 Thread.sleep(2000);
    	 profileup.viewprofile();
    	 logger.info("profile is opened");
    
    }

    @And("^verify the email$")
    public void verify_the_email() throws Throwable {
    	 profileup = new Profileupdate(driver);
    	 Thread.sleep(2000);
    	 profileup.views();
    	 profileup.verification();
    	 logger.info("mail verfication is done");
    	 
    
    }
}
