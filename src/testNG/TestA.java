package testNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestA {
	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demo.actitime.com/login.do");
	    
	    String eTitle = "actiTIME - Logi";
	    String aTitle = driver.getTitle();
	    
	    Assert.assertEquals(aTitle, eTitle);
	    
	    driver.close();
	}

}
