package runner;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features="src//test//resources//sampleFeatures//GooglePage.feature",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun=false,
		plugin= {
		      "pretty",
		      "html:target/reports/htmlReport.html",
//	          "usage:target/reports/usageReport"
//            "json:target/reports/jsonReport"
//		      "junit:target/reports/junitReport"
//		      "rerun:target/failed_scenarios.txt"
//		      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		        }
		)
public class GooglePageRunner {


}
