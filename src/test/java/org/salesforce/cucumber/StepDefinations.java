package org.salesforce.cucumber;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.salesforce.common.usersteps.UserSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	
	public WebDriver driver;
	UserSteps endUser;
			
	
	@Before
	public void Test_Setup()
	{		
		driver = new FirefoxDriver();
		endUser = new UserSteps(driver);		
	}
	
	@After
	public void Test_Cleanup()
	{
		driver.quit();
	}
		
	@Given("^I am on Mercury Tours and Travels Home page$")
	public void i_am_on_Mercury_Tours_and_Travels_Home_page() throws Throwable {
	    endUser.i_am_on_Mercury_Tours_and_Travels_Home_page();
	}

	@When("^I enter username \"(.*?)\"$")
	public void i_enter_username(String arg1) throws Throwable {
		endUser.i_enter_username(arg1);
	}

	@When("^I enter password \"(.*?)\"$")
	public void i_enter_password(String arg1) throws Throwable {
		endUser.i_enter_password(arg1);
	}
	
	@Then("^Flight Finder page should be displayed$")
	public void flight_Finder_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
	@After
	public void takeScreenShotOnFailure(Scenario testResult) throws IOException 
	{ 
		
		
		System.out.println("afterrrrrrr");
		if (testResult.isFailed()) 
		{ 
			System.out.println("result " + testResult.isFailed()); 
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(scrFile, new File("E:\\testScreenShot.jpg")); 
			} 
		} 
	 
	}	

