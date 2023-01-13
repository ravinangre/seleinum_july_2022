package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	public WebDriver driver;
  
	@Test
	@Parameters("browser")
     public void SelectBrowser(String Browser) {
	  	if(Browser.equalsIgnoreCase("chrome")) {
	    driver = new ChromeDriver();
	  	}
	  	else if(Browser.equalsIgnoreCase("edge")) {
		    driver=new EdgeDriver(); 
	  	}
	  	else if(Browser.equalsIgnoreCase("firefox")) {
	  		driver = new FirefoxDriver();
	  	}
	  	driver.get("https://www.utkarshaaacademy.com");
  }
}
