package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoD {
	@Test
	public void registerUser()
	{ 
		//Assert.fail();
		Reporter.log("register...", true);
	}
	@Test(dependsOnMethods="registerUser")
	public void deleteUser()
	{
		Reporter.log("delete...", true);
	}
}
