package org.salesforce.common.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class LoginPage      
{

	@FindBy(xpath = "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@name='userName']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@name='login']")
	public WebElement btnLogin;
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void GoToURL(String URL)
	{
		driver.get(URL);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void isExist()
	{
		
		Assert.assertTrue("Login page not found :(", btnLogin.isDisplayed());
	}
	public void EnterCredentials(String Username, String Password)
	{
		username.sendKeys(Username);		
		password.sendKeys(Password);
	}
	
	public void EnterUsername(String Username)
	{
		username.sendKeys(Username);		
		
	}
	public void EnterPassword(String Password)
	{
				
		password.sendKeys(Password);
	}
	public void ClickOnLoginButton()
	{
		btnLogin.click();
		
	}
	

}