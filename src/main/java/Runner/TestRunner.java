package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium_Workspace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\dealsmap.feature" // path of feature files
		,glue= {"stepDefinition"} // path of step definition file
		,plugin = {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} // generate html file which give better output. 
		,monochrome = true //display the console output in proper readable format
		,strict = true // check if any step not defined in step definition file then it will fail
		,dryRun= false // check mapping is proper between feature and step definition
		)

		

public class TestRunner {
 
}
