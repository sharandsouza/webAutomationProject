package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Username=By.cssSelector("input[id='login1']");
	By Password=By.cssSelector("input[id='password']");
	By Remember=By.cssSelector("input[id='remember']");
	By SignIn=By.cssSelector("input[title='Sign in']");

	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver; //Constructor
	}
	public WebElement getUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement getRadiobutton()
	{
		return driver.findElement(Remember);
	}
	public WebElement getSignin()
	{
		return driver.findElement(SignIn);
	}
}

