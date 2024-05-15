package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Flipkart.feature",
glue="org.step", dryRun=false, monochrome=true, plugin= {"html:Reports", "json:Reports\\jrepo.json"})
public class TestRunnerClass{
	
	
}



