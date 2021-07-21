package academy2;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources2.Base2;

public class ValidateTitle extends Base2 {
	
	public static Logger log =LogManager.getLogger(Base2.class.getName());

	LandingPage lp;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Rediff.com");
	}
	
	@Test
	public void titleRediff() throws IOException 
	{
		lp = new LandingPage(driver);
		String actualTitleRediff = lp.getTitleRediff().getText();
		Assert.assertEquals(actualTitleRediff, "Rediffmail");
		log.info("Sucessfully validated Title Rediff");

	}

    @Test
	public void titleMoney() 
	{
		lp= new  LandingPage(driver);
		String actualTitleMoney = lp.getTitleMoney().getText();
		Assert.assertEquals(actualTitleMoney, "Money");
		log.info("Validated Money Title");

	}

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
