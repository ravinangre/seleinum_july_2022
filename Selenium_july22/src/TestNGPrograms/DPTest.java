package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
@Listeners(ListenersTest.class)
public class DPTest {
	public WebDriver driver;
  @Test(dataProvider = "FBLogin")
  public void FaceBookLogin(String username, String password) {
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  Reporter.log("Chrome Successfully Started");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys(username);
	  PassWord.sendKeys(password);
	  LoginBtn.click();
	  Reporter.log("Successfully Enter username and password and click on login button",true);
	  
  }

  @DataProvider
  public Object[][] FBLogin() {
    return new Object[][] {
      new Object[] { "ravi.nangare@outlook.com", "a213312$@!" },
      new Object[] { "ravinangre1983@gmail.com", "QWERTY!@#$%^" },
      new Object[] { "ravinangre@gmail.com", "QWERTY!@#$%^" },
      new Object[] { "ravi.nangare@gmail.com", "QWERTY!@#$%^" },
      new Object[] { "ravi.nangre@allianz.com", "QWERTY!@#$%^" },
      new Object[] { "ravi.nangare@allianz.com", "QWERTY!@#$%^" },
      new Object[] { "ravinangre@rediff.com", "QWERTY!@#$%^" },
    };
  }
}
