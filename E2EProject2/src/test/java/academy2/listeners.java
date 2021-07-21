package academy2;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources2.Base2;

public class listeners implements ITestListener{
	
	Base2 b=new Base2();

	public void onTestFailure(ITestResult result) 
	{
		try 
		{
			b.getScreesnhot(result.getName());
		} 
		catch (IOException e) 
		{
					e.printStackTrace();
		}
		
	}
	
	

}
