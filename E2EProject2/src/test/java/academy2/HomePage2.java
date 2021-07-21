package academy2;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources2.Base2;

public class HomePage2 extends Base2{
	
	public static Logger log =LogManager.getLogger(Base2.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));	
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().click();
		LoginPage lg=new LoginPage(driver);
		lg.getUsername().sendKeys(Username);
		lg.getPassword().sendKeys(Password);
		lg.getRadiobutton().click();
		lg.getSignin().click();
		log.info("Home Page Validated");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]= "sharan.ds";
		data[0][1]=	"sharat123";	
		
		data[1][0]= "sharan.d";
		data[1][1]= "sharat123";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	

}
