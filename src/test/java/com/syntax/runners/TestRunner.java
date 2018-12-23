package com.syntax.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}
			, glue= {"com/syntax/stepDefinitions"}
            ,monochrome=true
			, dryRun=false)

public class TestRunner {
	
	

}
