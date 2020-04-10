package step_Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\chaithanya\\eclipse-project\\Naukri\\src\\main\\java\\feature\\test.feature",
			plugin = { "pretty",
					"html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
					"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
			//tags = {"@TC01_Naukri"},
			glue = {"naukri_Step"},
			monochrome = true
			)

	public class Login_Runner {
	
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src\\test\\resources\\Testreport\\extend_report.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
