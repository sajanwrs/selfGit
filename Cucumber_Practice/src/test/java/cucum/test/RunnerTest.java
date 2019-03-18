package cucum.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/mdrahman/Desktop/Bit Tech /eclipse/Cucumber_Practice/facebook.feature", glue={"cucum.main"},
					dryRun=false, format={"pretty", "json:json_output/cucumber.json"}, monochrome=true, strict=true
					)

public class RunnerTest {
	
}
