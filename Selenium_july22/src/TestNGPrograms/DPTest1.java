package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DPTest1 {
	public WebDriver driver;
	  @Test(dataProvider = "FBLogin",dataProviderClass = DPTest2.class)
	  public void FaceBookLogin(String username, String password, int age) {
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement PassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  UserName.sendKeys(username);
		  PassWord.sendKeys(password);
//		  age = 59;
//		  String Age = String.valueOf(age); 
//		  PassWord.sendKeys(Age);
		  LoginBtn.click();
	  }
}
