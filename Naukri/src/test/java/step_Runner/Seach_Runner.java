package step_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\chaithanya\\eclipse-project\\Naukri\\src\\main\\java\\feature\\test.feature",
		plugin = {"pretty", "html:target/htmlreports"},
		tags = {"@TC03_Naukri"},
		glue = {"naukri_Step"},
		monochrome = true
		)

public class Seach_Runner {

}
