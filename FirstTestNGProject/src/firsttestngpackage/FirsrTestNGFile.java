package firsttestngpackage;

//import static org.testng.Assert.astEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirsrTestNGFile {
 
 @Test
public void testNGTile()
{
	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");	
	String str = driver.getTitle();
    Assert.assertEquals(str, "Gmail");
}
}