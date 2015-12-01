package org.salesforce.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features" , format = { "pretty", "html:target/cucumber" })
public class CucumberRunnerTest{{
	
	try
	{
		int a=0;
	}
	catch(Exception e){
		
	}
}} 