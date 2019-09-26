package com.zoopla.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue="com/zoopla/steps"
		,monochrome=true
		,dryRun=false
		,tags= {"@smoke1"}
		,plugin = {"pretty", "html:target/cucumber-default-reports", "json:target/cucumber.json"}
		
		
		)

public class SmokRunner {

}
