package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EdgeTest {
	public WebDriver driver;
	@Test
	  public void EdgeTest() {
		  EdgeOptions eoption=new EdgeOptions();
		  eoption.addArguments("--headless");
		  driver = new EdgeDriver(eoption);
		  System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.tagName("button"));
		  UserName.sendKeys("ravinangre@gmail.com");
		  PassWord.sendKeys("123432134");
		  LoginBtn.click();
	  }
}
