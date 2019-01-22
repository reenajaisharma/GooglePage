package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public WebDriver dr;
	@BeforeMethod
	public void befClass()
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\latest\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://www.google.com");
		
	}

}
