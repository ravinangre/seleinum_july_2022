package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeTest {
	 public WebDriver driver;
	  @Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
	  public void ChromeTest() {
//		  ChromeOptions coption = new ChromeOptions();
//		  coption.addArguments("--headless");
//		  driver = new ChromeDriver();
	      System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
//		  driver.get("https://www.facebook.com");
//		  System.out.println(driver.getTitle());
//		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
//		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
//		  WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//		  UserName.sendKeys("ravinangre@gmail.com");
//		  PassWord.sendKeys("123432134");
//		  LoginBtn.click();
//		  driver.quit();
	  }
}
