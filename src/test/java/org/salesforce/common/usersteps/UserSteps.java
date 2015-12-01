package org.salesforce.common.usersteps;

import org.openqa.selenium.WebDriver;
import org.salesforce.common.pages.LoginPage;

public class UserSteps {

	LoginPage loginPage;
	
	public UserSteps(WebDriver driver)
	{
		loginPage = new LoginPage(driver);
		
	}
	
	public void i_am_on_Mercury_Tours_and_Travels_Home_page()
	{
		loginPage.GoToURL("http://newtours.demoaut.com/");
		loginPage.isExist();	
	}
	
	public void i_enter_username(String Username)
	{
		loginPage.EnterUsername(Username);
		
	}
	
	public void i_enter_password(String Password)
	{
		loginPage.EnterPassword(Password);
	}
	

}
