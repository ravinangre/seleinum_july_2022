package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class AnnotationDemo {
	public WebDriver driver;
  @Test
  public void first() {
	  System.out.println(driver.getTitle());
  }
  @Test
  public void second() {
	  System.out.println(driver.getCurrentUrl());
  }
  @Test
  public void third() {
	  System.out.println(driver.getPageSource());
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
