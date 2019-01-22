package testmodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testing.Base;

public class HomeTest extends Base{

	@Test(enabled=false)
	public void getTitleOfPage()
	{
		String title= dr.getTitle();
		System.out.println(title);
	}
	
	@Test(enabled=false)
	public void getGoogleOfferedIn()
	{
		List <WebElement> list = dr.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		Assert.assertEquals(list.size(), 9);
	}
	
	@Test(enabled=true)
	public void getSearchResult()
	{
		WebElement searchGoogle = dr.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		searchGoogle.sendKeys("prime");
		 dr.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")).click();
		
		
	}
}
