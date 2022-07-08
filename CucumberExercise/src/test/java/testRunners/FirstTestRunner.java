package testRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= "src/test/resources/featureFiles",
		glue = {"stepDefinittions"})


public class FirstTestRunner extends AbstractTestNGCucumberTests{
	

	
}
