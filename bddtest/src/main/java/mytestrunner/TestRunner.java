package mytestrunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\sonali 1 dec\\bddtest\\src\\test\\java\\feature\\Login.feature", //the path of the feature files
		glue="stepdefinations",monochrome=true,//the path of the step definition files
		//dryRun=true,
		//tags = {"~@SmokeTest" , "~@RegressionTest"ss, "~@End2End"}	
		plugin = {"pretty","html:target/cucumber","junit:target/cukies.xml"},
		tags = {"@smoketest"}

	   	
		)
		
		
public class TestRunner {
	
	

}

