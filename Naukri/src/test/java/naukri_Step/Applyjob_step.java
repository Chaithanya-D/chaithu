package naukri_Step;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.Applyjob;
import com.Login_page;

import Utility.Browser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Applyjob_step extends Browser {
	
	
		Logger logger = LogManager.getLogger(Login_page.class);
		Login_page loginpage = null;
		Applyjob applyjob  = null;
		WebDriver driver = null;

		@Given("^lauch browser and start app$")
		public void lauch_browser_and_start_app() throws Throwable {

			driver = Browsersetup("Chrome");
			loginpage = new Login_page(driver);
			applyjob = new Applyjob(driver);
			logger.info("Chrome Browser launches");

		}

		@When("^enter the valid credentials username and password$")
		public void enter_the_valid_credentials_username_and_password() throws Throwable {
			applyjob.jobsearch_naukri();
			applyjob.locationsearch();
			
			
		}

		@Then("^view the required job$")
		public void view_the_required_job() throws Throwable {
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			applyjob.view();
			logger.info("search completed");

		}

		@Then("^apply for it$")
		public void apply_for_it() throws Throwable {

			String parentWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String windowHandle : handles) {
				if (!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			applyjob.applyjb();
			Thread.sleep(3000);
			logger.info("applied for job");

		}

	}

