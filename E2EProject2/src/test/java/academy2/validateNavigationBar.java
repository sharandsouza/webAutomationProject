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

public class validateNavigationBar extends Base2 {
	
	public static Logger log =LogManager.getLogger(Base2.class.getName());

	LandingPage lp;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));	
	}
	@Test()
	public void navigateBar() throws IOException {
		
		lp = new LandingPage(driver);
		boolean NavBar=lp.getnavigationBar().isDisplayed();
		Assert.assertTrue(NavBar);
		log.info("Sucessfully validated Navigation Bar");
		

	}

		
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
