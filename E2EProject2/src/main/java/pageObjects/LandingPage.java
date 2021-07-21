package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	private By Signin = By.cssSelector("p[id='signin_info'] a[href*='login']");
	private By PageRediff= By.cssSelector("div[class='cell topicons'] a[href*='login']");
	private By PageMoney= By.cssSelector("div[class='cell topicons'] a[href*='money']");
	private By NavigationBar= By.xpath("//ul[@class='navbarul']");
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public WebElement getLogin() 
	{
		return driver.findElement(Signin);
	}
	public WebElement getTitleRediff()
	{
		return driver.findElement(PageRediff);
	}
	public WebElement getTitleMoney()
	{
		return driver.findElement(PageMoney);
	}
	public WebElement getnavigationBar()
	{
		return driver.findElement(NavigationBar);
	}
}