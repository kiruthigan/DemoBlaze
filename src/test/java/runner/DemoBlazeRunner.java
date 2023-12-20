package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//Feature//login.feature",
		glue = {"stepDefs"}
	//	dryRun = false,
		//monochrome = true,
		//plugin = {"pretty",
			//	"html:target//Reports//HtmlReport.html",
			//	}

		)

public class DemoBlazeRunner extends AbstractTestNGCucumberTests {

}
