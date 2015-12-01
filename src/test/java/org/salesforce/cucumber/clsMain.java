package org.salesforce.cucumber;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.salesforce.common.pages.LoginPage;
 
public class clsMain 
{
	public WebDriver driver = new FirefoxDriver();
	public LoginPage oLogin;
	
	@Test
    public void Test1()
    {
    
    	oLogin = new LoginPage(driver);    	
    	    	
    	oLogin.GoToURL("http://newtours.demoaut.com/");
    	oLogin.EnterCredentials("temp", "temp");
    	oLogin.ClickOnLoginButton();
    	
    	
    	
     
    
    
    
    
    }
}
