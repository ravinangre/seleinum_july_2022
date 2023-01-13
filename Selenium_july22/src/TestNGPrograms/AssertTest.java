package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
	public SoftAssert sassert;
	
  @Test(priority = 1)
  public void openBrowser() {
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  System.out.println("First Test Pass");
  }
  @Test(priority = 2)
  public void checkTitle()
  {
	  String Expected_Title ="Utkarsha Academy";
	  String Actual_Title = driver.getTitle();
	//  Assert.assertEquals(Actual_Title, Expected_Title);
	  sassert = new SoftAssert();
	  sassert.assertEquals(Actual_Title, Expected_Title);
	  System.out.println("Second Test Fail");
	  sassert.assertAll();
  }
  @Test(priority = 3)
  public void checkLogo() {
	  WebElement Ut_Logo = driver.findElement(By.xpath("//div[@class='av-column-2 my-auto']//img[@class='custom-logo']"));
	  Assert.assertEquals(Ut_Logo.isDisplayed(), true);
	  String Logo_PX = Ut_Logo.getCssValue("max-width");
	  System.out.println(Ut_Logo.getCssValue("max-width"));
	  Assert.assertEquals(Logo_PX, "140px");
	  System.out.println("Third Test Pass");
  }
}
