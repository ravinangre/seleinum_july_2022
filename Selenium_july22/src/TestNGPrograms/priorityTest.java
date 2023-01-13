package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityTest {
	public WebDriver driver;
	String pageTitle = "Utkarshaa Academy";
  @Test(groups = {"sanity"},priority = 1)
  public void starting_point() {
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  
  }
  @Test(groups = {"sanity"},priority = 2)
  public void checkTitle() {
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, pageTitle);
	  System.out.println("Test Pass");
  }
  @Test(dependsOnGroups = {"sanity"})
  public void clickonElement() {
	  driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @Test(dependsOnMethods = "clickonElement",enabled = false)
  public void insert_data() {
		driver.findElement(By.cssSelector("input#name-firstname")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input.coblocks-field.coblocks-field--name.last")).sendKeys("Nangare");
		driver.findElement(By.cssSelector("input[id*='ho']")).sendKeys("8830158607");
		driver.findElement(By.cssSelector("input#email[type='email']")).sendKeys("ravinangre@gmail.com");
  }
}
