package naukri_Step;

import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Search_job;

import Utility.Browser;
import Utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchjob_stepdefinition extends Browser {
	Search_job searched;
	
	final static Logger logger = LogManager.getLogger(searchjob_stepdefinition.class.getName());

	   
	  @Given("^Open the browser and start url$")
	    public void open_the_browser_and_start_url() throws Throwable{
	    	  driver = Browsersetup("Chrome");
	    	   searched =new Search_job(driver);
	    	  logger.info("Chrome Browser launches");
	    }


	  @Then("^user can click on the job$")
	    public void user_can_click_on_the_job() throws Throwable {
	    	searched = new Search_job(driver);
	    	searched.job();
	    	logger.info("search option is selected");
	    }


	    @Then("^enter the  job and location fields$")
	    public void enter_the_job_and_location_fields() throws Throwable{
	    	
	    	searched.place();
	    	Screenshot util = new Screenshot(driver);
    		util.takeSnapshot("./src/test/resources/Screenshots/sceenshot1.png");
	    }


	    @Then("^select search field$")
	    public void select_search_field() throws Throwable {
	    	
	    	searched.find();
	    	logger.info("job search is done");
	    	
	    }
	
	   

}