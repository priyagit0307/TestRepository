package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			publish=true,
			features="src//test//resources//taggedFeatures//",
			glue= {"stepDefs"},
			monochrome=true,
			dryRun=false,
			//tags="@RegressionTest or @SmokeTest",
			//tags="@PhaseOne and @RegressionTest",
			tags="@PhaseOne",
			plugin= {
			      "pretty",
			      "html:target/reports/htmlReport.html",
	  }
			      
)
	
	public class CRMRunner {
}
