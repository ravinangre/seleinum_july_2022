package TestNGPrograms;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class HobbyCenterTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void HobbyCM(String Email, String Fname, String Lname,String Age, String City, String State, String Pin) {
	  driver = new ChromeDriver();
	  driver.get("http://123.252.129.5:8080/hob");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  WebElement email = driver.findElement(By.xpath("//input[@name='email']")); 
	  WebElement fname = driver.findElement(By.xpath("//input[@name='name']"));
	  WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
	  WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
	  WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
	  WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
	  WebElement pin = driver.findElement(By.xpath("//input[@name='pin']"));
	  WebElement HobbyJava = driver.findElement(By.xpath("//input[@name='hob1']"));
	  WebElement HobbySoftwareTesting = driver.findElement(By.xpath("//input[@name='hob2']"));
	  WebElement HobbyCricket = driver.findElement(By.xpath("//input[@name='hob3']"));
	  WebElement WatchingMovies = driver.findElement(By.xpath("//input[@name='hob4']"));
	  WebElement Tennis = driver.findElement(By.xpath("//input[@name='hob5']"));
	  WebElement TV = driver.findElement(By.xpath("//input[@name='hob6']"));
	  WebElement ReadingBooks = driver.findElement(By.xpath("//input[@name='hob7']"));
	  WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
	  WebElement ResetBtn = driver.findElement(By.xpath("//input[@name='reset']"));
	  email.sendKeys(Email);
	  fname.sendKeys(Fname);
	  lname.sendKeys(Lname);
	  age.sendKeys(Age);
	  city.sendKeys(City);
	  state.sendKeys(State);
	  pin.sendKeys(Pin);
	  HobbyJava.click();
	  Tennis.click();
	  SubmitBtn.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ravinangre@gmail.com", "ravi", "nangare", "59", "Pune", "Maharashtra","411046"},
      new Object[] { "ravinangre1983@gmail.com", "ravi", "nangre", "60", "Pimpri", "Maharashtra","411041"},
      new Object[] { "ravi.nangre@gmail.com", "ravi", "nangare", "62", "Pune", "Maharashtra","411052"},
      new Object[] { "ravinangre@gmail.com", "ravi", "nangare", "61", "Pune", "Maharashtra","411046"},
      new Object[] { "ravinangre@gmail.com", "ravi", "nangare", "63", "Pune", "Maharashtra","411046"}
    };
  }
}
