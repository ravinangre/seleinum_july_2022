package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	public WebDriver driver;
  @Test
  public void openBrowser() {
	  driver = new ChromeDriver();
	  System.out.println("This will execute First (open Browser)");
  }
}
