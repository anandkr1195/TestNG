package testNG;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
public class DemoB extends Basetest {
	@Test
	public void testB()
	{
		Reporter.log("testA.", true);
	}
	@Test
	public void testC()
	{
		Reporter.log("testC..", true);
	}

}
