package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test(priority=4)
	public void registerUser()
	{
		Reporter.log("register...", true);
	}
	@Test(priority=8)
	public void deleteUser()
	{
		Reporter.log("delete...", true);
	}

}
